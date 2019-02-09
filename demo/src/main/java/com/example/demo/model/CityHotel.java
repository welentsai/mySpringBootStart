package com.example.demo.model;

import java.io.Serializable;

/* CityHotel POJO */
public class CityHotel implements Serializable {

	private Long id;
	private String cityName;
	private String hotelName;
	private String hotelAddress;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getHotelName() {
		return this.hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelAddress() {
		return this.hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	@Override
	public String toString() {
		return getId() + "," + getCityName() + "," + getHotelName() + "," + getHotelAddress();
	}
}