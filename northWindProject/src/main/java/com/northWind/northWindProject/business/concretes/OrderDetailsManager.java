package com.northWind.northWindProject.business.concretes;


import org.springframework.beans.factory.annotation.Autowired;

import com.northWind.northWindProject.business.abstracts.IOrderDetailsService;
import com.northWind.northWindProject.dataaccess.concretes.CartRepository;
import com.northWind.northWindProject.dataaccess.concretes.OrderDetailsRepository;
import com.northWind.northWindProject.dataaccess.concretes.OrdersRepository;
import com.northWind.northWindProject.entities.conretes.OrderDetails;
import com.northWind.northWindProject.entities.conretes.Orders;

public class OrderDetailsManager implements IOrderDetailsService{
	@Autowired
	OrderDetailsRepository orderDetailsRepository;
	@Autowired
	OrdersRepository ordersRepository;
	@Autowired
	CartRepository cartRepository;
	@Autowired
	Orders orders;
	@Autowired
	OrderDetails orderDetails;
	
	public int getOrders(int orderId) { 
		return orderDetailsRepository.getOrders(orderId);
} 
	
	@Override
	public void sell(int orderId) {
		if(orderDetailsRepository.getOrders(orderId)==0)
			System.out.println("Please add product.");
		else {
			 ordersRepository.save(orders);
		    orderDetailsRepository.save(orderDetails);
		}}
    
	@Override
	public void deleteCart(int cartId) {
		
		if(orderDetailsRepository.count()>0)
			cartRepository.deleteById(cartId);
		else
		   cartRepository.findById(cartId).get();
		    	}}
