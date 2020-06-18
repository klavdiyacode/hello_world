package com.example.prog.service;


import org.springframework.stereotype.Service;
import com.example.prog.entity.Hotel;
import com.example.prog.repos.HotelRepository;
import java.util.Collection;
import java.util.List;

@Service
public class HotelService{

	
	private HotelRepository hotelRepo;

	public HotelService(HotelRepository hotelRepo){
		this.hotelRepo=hotelRepo;
	}	

	public Iterable<Hotel>hotelsList(){
		return hotelRepo.findAll();
	}

	public Hotel hotelSave(Hotel hotel){
		return hotelRepo.save(hotel);
	}

	public void hotelListsave(List<Hotel>hotels){
		hotelRepo.saveAll(hotels);
	}

	public Hotel hotelById(long id){
		return hotelRepo.findById(id).get();
	}


}

