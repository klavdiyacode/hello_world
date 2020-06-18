package com.example.prog.entity;

import com.example.prog.entity.Hotel; 
import com.example.prog.entity.Order; 
import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema="json", name="room")
public class Room {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long room_id;

    private int room_capacity;
    private int room_number;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name="hotel_id")
    private Hotel hotel;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
        name="ROOM_ORDER", joinColumns= @JoinColumn(name="room_id"),
        inverseJoinColumns= @JoinColumn(name="order_id"))
    private List<Order> order_id;

    public Room(){
    }

    public Long getRoomId(){
    	return room_id;
    }
    public int getRoomCapacity(){
    	return room_capacity;
    }
    public int getRoomNumber(){
    	return room_number;
    }
    public Hotel getHotel(){
        return hotel;
    }
    // public Order getOrderId(){
    //     return order_id;
    // }
    public void setHotel(Hotel hotel_id){
        this.hotel=hotel_id;
    }
    public void setRoomId(Long room_id){
    	this.room_id=room_id;
    }
    // public void setOrderId(Order order_id){
    //     this.order_id=order_id;
    // }
    public void setRoomCapacity(int room_capacity){
    	this.room_capacity=room_capacity;
    }
    public void setRoomNumber(int room_number){
    	this.room_number=room_number;
    }

}