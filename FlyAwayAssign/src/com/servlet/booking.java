package com.servlet;

public class booking {

	private String airline_name;
	private String price;
	private int flight_no;
	private String source_city;
	private String destination;
	
	public String getAirline_name() {
		return airline_name;
	}
	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getFlight_no() {
		return flight_no;
	}
	public void setFlight_no(int flight_no) {
		this.flight_no = flight_no;
	}
	public String getSource_city() {
		return source_city;
	}
	public void setSource_city(String source_city) {
		this.source_city = source_city;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
}
