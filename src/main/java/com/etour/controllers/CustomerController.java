package com.etour.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.etour.entities.Customers;
import com.etour.services.CustomerService;

@RestController
@CrossOrigin("*")
public class CustomerController {
	
	@Autowired
	private CustomerService customerservice;
	
	@GetMapping("/api/customer")
	List<Customers> getallcustomer()
	{
		return customerservice.getcustomers();
	}
	/*
	 * @GetMapping("/api/customer/bookingid/") Optional<Customers>
	 * getCustomerbyBookingId(int id) {
	 * 
	 * return customerservice.getCustomerbyBookingId(id); }
	 */

	
	
	@GetMapping("/api/customerbyid/{id}")
	public Optional<Customers> getcustomerbyid(@PathVariable int id)
	{
		return customerservice.getcustomerbyid(id);
	}
	
	@PostMapping("/api/CustomerController")
	public void createCustomer(Customers customers)
	{
		customerservice.createCustomer(customers);
	}
	
	@DeleteMapping("/api/CustomerController/{id}")
	void deleteCustomer(int id)
	{
		customerservice.deleteCustomer(id);
	}
	


}
