package com.northWind.northWindProject.api.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.northWind.northWindProject.business.abstracts.IOrderDetailsService;
import com.northWind.northWindProject.entities.conretes.Cart;
import com.northWind.northWindProject.entities.conretes.OrderDetails;

@RestController
@RequestMapping("api/v1")
public class OrderDetailsController {
	@Autowired
	IOrderDetailsService orderDetailsService;
	
	@GetMapping("/orderDetails/sell/{customerId},{orderId}")
	public void sell(@PathVariable (value = "id")String customerId,
			@PathVariable (value = "id")int orderId,
			 @RequestBody OrderDetails OrderDetails) {
		orderDetailsService.sell(orderId);
		
	}
	@DeleteMapping("/orderDetails/deleteCart/{cartId}")
	public void deleteCart(@PathVariable(value = "id")int cartId,
			@RequestBody Cart cart) {
		orderDetailsService.deleteCart(cartId);
	}

}
