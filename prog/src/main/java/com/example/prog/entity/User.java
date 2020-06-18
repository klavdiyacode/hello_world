package com.example.prog.entity;

import javax.persistence.*;
import com.example.prog.entity.Order;
import java.util.List;


@Entity
@Table(schema="json", name="user")
public class User{
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long user_id;

	private String user_name;
	private String user_surname;
	private String user_phone;
	private String user_email;

	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private List<Order>orders;

	public User(){
	}

	public Long getId(){
		return user_id;
	}
	public String getUserName(){
		return user_name;
	}
	public String getUserSurname(){
		return user_surname;
	}
	public String getUserPhone(){
		return user_phone;
	}
	public String getUserEmail(){
		return user_email;
	}

	public void setUserId(Long user_id){
		this.user_id=user_id;
	}
	public void setUserName(String user_name){
		this.user_name=user_name;
	}
	public void setUserSurname(String user_surname){
		this.user_surname=user_surname;
	}
	public void setUserPhone(String user_phone){
		this.user_phone=user_phone;
	}
	public void setUserEmail(String user_email){
		this.user_email=user_email;
	}
}
