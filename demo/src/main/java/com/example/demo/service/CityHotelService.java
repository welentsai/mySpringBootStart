package com.example.demo.service;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.example.demo.dao.CityHotelDao;
import com.example.demo.model.CityHotel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityHotelService {

	private static final Logger log = LoggerFactory.getLogger(CityHotelService.class);

	static final String NOT_INITIALIZED_MESSAGE = "CityHotel DAO has not been initialized, cannot continue.";

	@Autowired
	private CityHotelDao cityHotelDao;

	CityHotelDao getCityHotelDao() {
		if(cityHotelDao == null) {
			throw new RuntimeException(NOT_INITIALIZED_MESSAGE);
		}
		return cityHotelDao;
	}

	public List<CityHotel> selectHotelsByCityId(Long id) {
		return getCityHotelDao().selectHotelsByCityId(id);
	}
}