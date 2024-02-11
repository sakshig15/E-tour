package com.etour.services;

import java.util.List;
import java.util.Optional;

import com.etour.entities.Cost_master;

public interface Cost_masterService 
{
	void add(Cost_master ref);
	List<Cost_master> getAllCostMaster();
	void delete(int id);
	Optional<Cost_master> getCost_masterById(int id);
	// public Optional<Cost_master> getCostMastercostbyid(int id);
	// Optional<Cost_master> getCostByPackid(int id);
}
