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
	
	@GetMapping("/api/customerbyid/{id}")
	public Optional<Customers> getcustomerbyid(@PathVariable int id)
	{
		return customerservice.getcustomerbyid(id);
	}
	
//	@GetMapping("/api/fetchcustomerpass/{id}")
//	public Optional<Customers> getcustomerbypass(@PathVariable int id)
//	{
//		return customerservice.getCustomerbypass(id);
//	}
//	
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
	
//	@PutMapping("/api/UpdateCustomerbyPass/{id}")
//	void updateCustomerPass(@PathVariable Integer Id,@RequestBody Customers customer)
//	{
//		customerservice.putcustomerpass(customer.getPassword(), Id);
//	}
//	
//	@PutMapping("/api/CustomerEmail/{id}")
//	void putCustomersEmail(@PathVariable Integer Id,@RequestBody Customers customer)
//	{
//		customerservice.putcustomermail(customer.getEmail(), Id);
//	}
//	
//	@PutMapping("/api/CustomerFirstName/{id}")
//	void putCustomersFirstName(@PathVariable Integer Id,@RequestBody Customers customer)
//	{
//		customerservice.putcustomerFirstName(customer.getFirstname(), Id);
//	}
////	@GetMapping("/api/GetCustomerMobile/{Id}")
////	public Optional <Customers> getCustomerMobile(@PathVariable int Id) {
////		return customerservice.getCustomerbymobile(Id);
////	}
//	@GetMapping("/api/CustomerLoginValidation/{mobile}/{password}")
//    public Optional <Customers>  getCustomerbymobile(@PathVariable String mobile,@PathVariable String password,@RequestBody Customers customer){
//		return customerservice.getCustomerbymobile(mobile, password);
//    }

}
