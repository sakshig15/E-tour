package com.etour.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Passenger 
{
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int passenger_id;
	 private int customer_id;
	 private int package_id;
	 private int passenger_amount;
	 private String passenger_birthdate;
	 private String passenger_name;
	 private String passenger_type;
	 private int booking_id;
	public int getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(int passenger_id) {
		this.passenger_id = passenger_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getPackage_id() {
		return package_id;
	}
	public void setPackage_id(int package_id) {
		this.package_id = package_id;
	}
	public int getPassenger_amount() {
		return passenger_amount;
	}
	public void setPassenger_amount(int passenger_amount) {
		this.passenger_amount = passenger_amount;
	}
	public String getPassenger_birthdate() {
		return passenger_birthdate;
	}
	public void setPassenger_birthdate(String passenger_birthdate) {
		this.passenger_birthdate = passenger_birthdate;
	}
	public String getPassenger_name() {
		return passenger_name;
	}
	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}
	public String getPassenger_type() {
		return passenger_type;
	}
	public void setPassenger_type(String passenger_type) {
		this.passenger_type = passenger_type;
	}
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public Passenger(int passenger_id, int customer_id, int package_id, int passenger_amount,
			String passenger_birthdate, String passenger_name, String passenger_type, int booking_id) {
		super();
		this.passenger_id = passenger_id;
		this.customer_id = customer_id;
		this.package_id = package_id;
		this.passenger_amount = passenger_amount;
		this.passenger_birthdate = passenger_birthdate;
		this.passenger_name = passenger_name;
		this.passenger_type = passenger_type;
		this.booking_id = booking_id;
	}
	public Passenger() {
		super();
	}
	@Override
	public String toString() {
		return "Passenger [passenger_id=" + passenger_id + ", customer_id=" + customer_id + ", package_id=" + package_id
				+ ", passenger_amount=" + passenger_amount + ", passenger_birthdate=" + passenger_birthdate
				+ ", passenger_name=" + passenger_name + ", passenger_type=" + passenger_type + ", booking_id="
				+ booking_id + "]";
	}
	
	
	
	
	
}
