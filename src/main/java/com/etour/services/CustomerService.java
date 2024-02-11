package com.etour.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.etour.entities.Customers;


public interface CustomerService {
	List<Customers> getcustomers();
	public Optional<Customers> getcustomerbyid(int id);
	void createCustomer(Customers customers);
	void deleteCustomer(int id);
	//void putcustomerpass(String pass,int id);
	//void putcustomermail(String email,int id);
	//void putcustomerFirstName(String name,int id);
	//public Optional<Customers> getCustomerbypass(String pass);//This method indicates that it may return a Customers object if found by the given ID, or it may return an empty Optional if no customer is found with the specified ID
	//Optional<Customers> getCustomerbymobile(String mobile,String password);
	

}
