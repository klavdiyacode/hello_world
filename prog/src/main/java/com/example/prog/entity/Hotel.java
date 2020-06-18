package com.example.prog.entity;

import javax.persistence.*;
import com.example.prog.entity.Room;
import java.util.List;


@Entity
@Table(schema="json", name="hotel")
public class Hotel{
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long hotel_id;

    private String hotel_name;
    private String hotel_address;
    private String hotel_phone;
    private String hotel_email;
    private int hotel_capacity;
    
    @OneToMany(mappedBy = "hotel", fetch = FetchType.EAGER)
    private List<Room>rooms;

    public Hotel(){
    }
    public Long getHotelId(){
    	return hotel_id;
    }
    public String getHotelName(){
    	return hotel_name;
    }
    public String getHotelAddress(){
    	return hotel_address;
    }
    public String getHotelPhone(){
    	return hotel_phone;
    }
    public String getHotelEmail(){
    	return hotel_email;
    }
    public int getHotelCapacity(){
    	return hotel_capacity;
    }

    public void setHotelId(Long id){
    	this.hotel_id=id;
    }
    public void setHotelName(String hotel_name){
    	this.hotel_name=hotel_name;
    }
    public void setHotelAddress(String hotel_address){
    	this.hotel_address=hotel_address;
    }
    public void setHotelPhone(String hotel_phone){
    	this.hotel_phone=hotel_phone;
    }
    public void setHotelEmail(String hotel_email){
    	this.hotel_email=hotel_email;
    }
    public void setHotelCapacity(int hotel_capacity){
    	this.hotel_capacity=hotel_capacity;
    }



}