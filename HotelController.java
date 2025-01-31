package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Hotel;
import service.HotelService;

@RestController

public class HotelController {
	
	//HotelService hser = new HotelService();
	
	@Autowired
	HotelService hser;
	@PostMapping("/myhotel/hotel/add")
	public String saveNewHotel(@RequestBody Hotel newhotel) {
		System.out.println("from broswer hotel data---->"+newhotel);
		hser.addNewHotel(newhotel);
		return "successfully added new hotel--->"+newhotel.getName();
	}

}
