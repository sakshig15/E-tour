package com.etour.services;

import java.util.List;

import com.etour.entities.Iternary;

public interface IternaryService 
{
	List<Iternary> getIternary();
	List<Iternary> getIternaryById(int packid);

}
