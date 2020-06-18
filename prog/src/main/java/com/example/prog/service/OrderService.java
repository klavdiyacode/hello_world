package com.example.prog.service;


import org.springframework.stereotype.Service;
import com.example.prog.entity.Order;
import com.example.prog.repos.OrderRepository;
import java.util.Collection;
import java.util.List;

@Service
public class OrderService{
	private OrderRepository orderRepo;

	public OrderService(OrderRepository orderRepo){
		this.orderRepo=orderRepo;
	}	

	public Iterable<Order>ordersList(){
		return orderRepo.findAll();
	}

	public Order orderSave(Order order){
		return orderRepo.save(order);
	}

	public void orderListsave(List<Order>orders){
		orderRepo.saveAll(orders);
	}

	public Order orderById(long id){
		return orderRepo.findById(id).get();
	}


}

