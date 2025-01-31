package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Hotel;
import repo.HotelRepo;

@Service
public class HotelService {
	
	@Autowired
	HotelRepo hRepo;

	public void addNewHotel(Hotel newhotel) {

		hRepo.save(newhotel);
	}

} 
