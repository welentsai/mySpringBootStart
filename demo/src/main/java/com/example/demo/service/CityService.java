package com.example.demo.service;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.example.demo.dao.CityDao;
import com.example.demo.model.City;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CityService {

	private static final Logger log = LoggerFactory.getLogger(CityService.class);

	static final String NOT_INITIALIZED_MESSAGE = "City DAO has not been initialized, cannot continue.";

	@Autowired
	private CityDao cityDao;

	CityDao getCityDao() {
		if(cityDao == null) {
			throw new RuntimeException(NOT_INITIALIZED_MESSAGE);
		}
		return cityDao;
	}

	public City selectCityById(Long id) {
    	return getCityDao().selectCityById(id);
	}

	public List<City> findAllCities() {
		return getCityDao().findAllCities();
	}

	public Map<Long, String> selectNames() {
		Map<Long, String> baseMap = new HashMap<Long, String>();
		List<Map<Long, String>> baseList = getCityDao().selectNames();
		for(Map<Long, String> map: baseList) {
			Long id = null;
			String name = null;
			for(Map.Entry<Long, String>  entry:map.entrySet()) {
				if ("NAME".equals(entry.getKey())) {  
                	name = (String) entry.getValue();  
            	} else if ("ID".equals(entry.getKey())) {
            		id = Long.parseLong(String.valueOf(entry.getValue()));
	            }
			}
			baseMap.put(id, name);
		}
		return baseMap;
	}
}