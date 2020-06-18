package com.example.prog.service;


import org.springframework.stereotype.Service;
import com.example.prog.entity.Room;
import com.example.prog.repos.RoomRepository;
import java.util.Collection;
import java.util.List;

@Service
public class RoomService{
	private RoomRepository roomRepo;

	public RoomService(RoomRepository roomRepo){
		this.roomRepo=roomRepo;
	}	

	public Iterable<Room>roomsList(){
		return roomRepo.findAll();
	}

	public Room roomSave(Room room){
		return roomRepo.save(room);
	}

	public void roomListsave(List<Room>rooms){
		roomRepo.saveAll(rooms);
	}

	public Room roomById(long id){
		return roomRepo.findById(id).get();
	}


}

