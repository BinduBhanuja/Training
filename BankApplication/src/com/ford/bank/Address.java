package com.ford.bank;

public class Address {

	private int buildingNumber;
	private String street;
	private String area;
	private int pincode;
	
//	public Address(int building_number, String street, String area, int pincode) {
//		// TODO Auto-generated constructor stub
//		this.building_number = building_number;
//		this.street = street;
//		this.area = area;
//		this.pincode = pincode;
//	}
	public Address(int buildingNumber, String street, String area, int pincode) {
		// TODO Auto-generated constructor stub
		this.buildingNumber = buildingNumber;
		this.street = street;
		this.area = area;
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	

}
