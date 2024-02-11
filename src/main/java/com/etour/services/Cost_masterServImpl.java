package com.etour.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etour.entities.Cost_master;
import com.etour.repositories.Cost_masterRepository;

@Service
public class Cost_masterServImpl implements Cost_masterService
{

	@Autowired
	Cost_masterRepository repo;

	@Override
	public void add(Cost_master ref) {
		repo.save(ref);
		
	}

	@Override
	public List<Cost_master> getAllCostMaster() {
		
		return repo.findAll();
	}

	@Override
	public void delete(int id) {
		
		repo.deleteById(id);
	}

	@Override
	public Optional<Cost_master> getCost_masterById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}


	
	

}


