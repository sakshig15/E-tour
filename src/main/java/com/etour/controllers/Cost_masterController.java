package com.etour.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.etour.entities.Cost_master;
import com.etour.services.Cost_masterService;

@RestController
@CrossOrigin("*")
public class Cost_masterController {

	@Autowired
	private Cost_masterService serv;
	
	@PostMapping
	public void addcostmaster(@RequestBody Cost_master cust)
	{
		serv.add(cust);
	}
	
	@GetMapping("/api/getcost")
	List<Cost_master> getAllCostMaster(){
		 return serv.getAllCostMaster();
	}

	@DeleteMapping("/api/deleterecord/{Id}")
	void deleteCostmasterbyid(@PathVariable int Id) {
		serv.delete(Id);
		
	}
	@GetMapping("/api/getrecord/{Id}")
	public Optional<Cost_master> getCostbyid(@PathVariable int Id)
	{
		return serv.getCost_masterById(Id);
	}

	/*
	 * @GetMapping("/api/getCostByPack/{Id}") public Optional<Cost_master>
	 * getByPackid(@PathVariable int Id) { return serv.getCostByPackid(Id); }
	 */
}
