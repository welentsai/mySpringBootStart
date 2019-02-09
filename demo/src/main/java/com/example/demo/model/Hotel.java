package com.example.demo.model;

import java.io.Serializable;

public class Hotel implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long city; // city id

	private String name;

	private String address;

	private String zip;

	public Long getCity() {
		return this.city;
	}

	public void setCity(Long cityId) {
		this.city = cityId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return getCity() + "," + getName() + "," + getAddress() + "," + getZip();
	}
}