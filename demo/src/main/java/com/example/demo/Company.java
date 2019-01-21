package com.example.demo;

import org.springframework.stereotype.Component;

class Address {
	private String street;
  private int number;
 
  public Address(String street, int number) {
      this.street = street;
      this.number = number;
  }
 
  // getters and setters
}

@Component
public class Company {
	private Address address;

	public Company(Address address) {
    this.address = address;
   }
}