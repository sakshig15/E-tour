package com.etour.entities;


import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Customers")
public class Customers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")
	private int cust_id;
	
	@Column(name="customer_firstname")
	private String firstname;
	
	@Column(name="customer_lastname")
	private String lastname;
	
	
	@Column(name="dateofbirth")
	private String dateofbirth;
	
	@Column(name="email")
	private String email;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="password")
	private String password;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id" , referencedColumnName = "customer_id")
	private Set<Booking>booking;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id" , referencedColumnName = "customer_id")
	private Set<Passenger>passenger;
	
	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	
	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Customers(int cust_id, String firstname, String lastname, String cust_details, String dateofbirth,
			String email, String gender, String mobile, String password) {
		super();
		this.cust_id = cust_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateofbirth = dateofbirth;
		this.email = email;
		this.gender = gender;
		this.mobile = mobile;
		this.password = password;
	}

	public Customers() {
		super();
		
	}


		
	
	

}
