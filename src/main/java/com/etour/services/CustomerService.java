package com.etour.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.etour.entities.Customers;


public interface CustomerService {
	List<Customers> getcustomers();
	public Optional<Customers> getcustomerbyid(int id);
	void createCustomer(Customers customers);
	void deleteCustomer(int id);
	 
	
	public Optional<Customers> getCustomerbyBookingId();
}
