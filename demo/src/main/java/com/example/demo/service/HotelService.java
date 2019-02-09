package com.example.demo.service;

import com.example.demo.dao.HotelDao;
import com.example.demo.model.Hotel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {

	private static final Logger log = LoggerFactory.getLogger(HotelService.class);

	static final String NOT_INITIALIZED_MESSAGE = "Hotel DAO has not been initialized, cannot continue.";

	@Autowired
	private HotelDao hotelDao;

	HotelDao getHotelDao() {
		if(hotelDao == null) {
			throw new RuntimeException(NOT_INITIALIZED_MESSAGE);
		}
		return hotelDao;
	}

	public Hotel selectHotelById(Integer cityId) {
    	return getHotelDao().selectHotelById(cityId);
	}
}