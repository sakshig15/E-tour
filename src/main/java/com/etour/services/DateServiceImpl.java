package com.etour.services;

import java.util.List;
import java.util.Optional;

import com.etour.entities.Date;
import com.etour.repositories.DateRepository;

public class DateServiceImpl implements DateService
{
	DateRepository daterepository;

	@Override
	public List<Date> getDate() {
		// TODO Auto-generated method stub
		return daterepository.findAll() ;
	}

	@Override
	public Optional<Date> getDate(int id) {
		// TODO Auto-generated method stub
		return daterepository.findById(id);
	}

}
