package com.etour.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etour.entities.Booking;
import com.etour.repositories.BookingRepository;
@Service
public class BookingServiceImpl implements BookingService
{
	@Autowired
	BookingRepository bookingrepository ;
	
	@Override
	public List<Booking> getBookings() {
		return bookingrepository.findAll();
	}
	
	@Override
	public Optional<Booking> getBookingsbyid(int id) {
		return bookingrepository.findById(id);
	}
}