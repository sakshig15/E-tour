package com.etour.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.etour.entities.Customers;

@Repository  //This annotation marks the interface as a Spring repository bean.
@Transactional  //This annotation marks the interface as transactional, meaning methods within it will be executed within a transaction.
public interface CustomersRepository extends JpaRepository<Customers,Integer>//Customers is the entity class that this repository manages. It represents the data model for the database table associated with the repository.
//Integer is the type of the primary key of the entity (Customers). In this case, it indicates that the primary key is of type Integer.
{
	
//	void UpdateCustomerPass(@Param("pass") String pass,@Param("id") Integer id );
//	
//	void UpdateCustomerEmail(@Param("email") String email,@Param("id") Integer id);
//	
//	void UpdateCustomerFirst(@Param("firstname")String firstname,@Param("id") Integer id);
//	
//	//Optional<Customers> fetchcustomerpass(@Param("pass") String pass );
//	
//	Optional<Customers> fetchcustomerbyid(@Param("id") int id );
//	
//	Optional<Customers> getCustomerByMobileAndPassword(@Param("mob") String mobile, @Param("password") String password);
//	
}
