package com.northWind.northWindProject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;

import com.northWind.northWindProject.business.abstracts.IOrdersService;
import com.northWind.northWindProject.dataaccess.concretes.CartRepository;
import com.northWind.northWindProject.dataaccess.concretes.OrdersRepository;
import com.northWind.northWindProject.entities.conretes.Cart;
import com.northWind.northWindProject.entities.conretes.Orders;

public class OrdersManager implements IOrdersService {
	@Autowired
	OrdersRepository ordersRepository;
	@Autowired
	CartRepository cartRepository;
	@Autowired
	Cart cart;
	@Autowired
	Orders orders;

public String getProductInCart(String customerId) {
		return ordersRepository.getProductInCart(customerId);
	}
	
	@Override
	public Orders insertOrder(String customerId, int productId) {
		Orders orders = new Orders();
		orders.setCustomerId(customerId);
		orders.setCartId(productId);
		orders.setOrderDate(null);
		orders.setOrderId(productId);
		
		
	     if(getProductInCart(customerId).isEmpty())
	    	System.out.println("No Product!");
	     else ordersRepository.save(orders);
	     return orders;}
    
	}
	     
			
	           
	            
	        
	

	
	


