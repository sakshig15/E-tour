package com.etour.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etour.entities.Customers;
import com.etour.repositories.CustomersRepository;

@Service
public class CustomerServiceImple implements CustomerService {

	@Autowired
	CustomersRepository customersrepository;
	
	@Override
	public List<Customers> getcustomers() {
		// TODO Auto-generated method stub
		return customersrepository.findAll();
	}
	
	@Override
	public void createCustomer(Customers customers) {
		// TODO Auto-generated method stub
		
		customersrepository.save(customers);
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customersrepository.deleteById(id);
	}

	@Override
	public Optional<Customers> getcustomerbyid(int id) {
		Optional<Customers> ls = customersrepository.findById(id);
		return ls;
	}

	@Override
	public Optional<Customers> getCustomerbyBookingId() {
		
		return customersrepository.getCustomerbyBookingId();
		
	}

	
//	@Override
//	public Optional<Customers> getCustomerbypass(String pass) {
//		// TODO Auto-generated method stub
//		return customersrepository.fetchcustomerpass(pass);
//	}

//	@Override
//	public Optional<Customers> getCustomerbymobile(String mobile, String password) {
//		// TODO Auto-generated method stub
//		return customersrepository.getCustomerByMobileAndPassword(mobile, password);
//	}

	

//	@Override
//	public void putcustomerpass(String pass, int id) {
//		// TODO Auto-generated method stub
//		
//		customersrepository.UpdateCustomerPass(pass, id);
//		
//	}
//
//	@Override
//	public void putcustomermail(String email, int id) {
//		// TODO Auto-generated method stub
//		customersrepository.UpdateCustomerEmail(email, id);
//		
//	}
//
//	@Override
//	public void putcustomerFirstName(String name, int id) {
//		// TODO Auto-generated method stub
//		customersrepository.UpdateCustomerFirst(name, id);
//		
//	}
////
////	@Override
////	public Optional<Customers> getCustomerbymobile(int id) {
////		// TODO Auto-generated method stub
////		return customersrepository.fetchcustomerMObile(id);
////	}
//
//	
//
//	@Override
//	public Optional<Customers> getcustomerbyid(int id) {
//		// TODO Auto-generated method stub
//		return customersrepository.fetchcustomerbyid(id);
//	}

	

}
