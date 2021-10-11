package com.demo.shoppingcart.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String street;
	private Integer pincode;
	private String city;
	private String country;

	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", pincode=" + pincode + ", city=" + city + ", country=" + country + "]";
	}
}
