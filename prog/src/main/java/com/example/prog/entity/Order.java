package com.example.prog.entity;

import javax.persistence.*;
import com.example.prog.entity.User;
import com.example.prog.entity.Room;
import java.util.List;


@Entity
@Table(schema="json", name="order")
public class Order{
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long order_id;

	private String order_date;
	
	@ManyToMany(mappedBy="order_id")
	private List<Room>room_id;

	@ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
	private User user;

	public Order(){
	}
	// public Room getRoomId(){
	// 	return room_id;
	// }
	public User getUser(){
		return user;
	}
	public Long getOrderId(){
		return order_id;
	}
	public String getOrderDate(){
		return order_date;
	}

	public void setUser(User user_id){
		this.user=user_id;
	}
	// public void setRoomID(Room room_id){
	// 	this.room_id=room_id;
	// }
	public void setOrderId(Long order_id){
		this.order_id=order_id;
	}
	public void setOrderDate(String order_date){
		this.order_date=order_date;
	}


}