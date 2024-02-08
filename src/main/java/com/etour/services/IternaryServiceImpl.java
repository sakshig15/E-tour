package com.etour.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.etour.entities.Iternary;
import com.etour.repositories.IternaryRepository;

public class IternaryServiceImpl implements IternaryService
{
	@Autowired
	IternaryRepository iternaryrepository ;
	
	@Override
	public List<Iternary> getIternary() {
		// TODO Auto-generated method stub
		return iternaryrepository.findAll();
	}

	@Override
	public List<Iternary> getIternaryById(int packid) {
		// TODO Auto-generated method stub
		return iternaryrepository.findByPackage_id(packid);
	}

}
