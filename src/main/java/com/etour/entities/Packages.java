package com.etour.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Packages {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int package_id;
	private String package_name;
	private String package_image_path;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="package_id" ,referencedColumnName = "package_id")
	private Set<Date> date;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="package_id" ,referencedColumnName = "package_id")
	private Set<Cost_master> cost_master;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="package_id" ,referencedColumnName = "package_id")
	private Set<Iternary> iternary;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="package_id" ,referencedColumnName = "package_id")
	private Set<Booking> booking;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="package_id" ,referencedColumnName = "package_id")
	private Set<Passenger> passenger;
	
	
	public int getPackage_id() {
		return package_id;
	}
	public void setPackage_id(int package_id) {
		this.package_id = package_id;
	}
	public String getPackage_name() {
		return package_name;
	}
	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}
	public String getPackage_image_path() {
		return package_image_path;
	}
	public void setPackage_image_path(String package_image_path) {
		this.package_image_path = package_image_path;
	}
	public Packages(int package_id, String package_name, String package_image_path) {
		super();
		this.package_id = package_id;
		this.package_name = package_name;
		this.package_image_path = package_image_path;
	}
	public Packages() {
		super();
	}
	@Override
	public String toString() {
		return "Packages [package_id=" + package_id + ", package_name=" + package_name + ", package_image_path="
				+ package_image_path + "]";
	}	
}