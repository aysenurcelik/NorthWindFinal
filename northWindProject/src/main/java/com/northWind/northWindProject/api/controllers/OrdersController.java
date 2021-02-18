package com.northWind.northWindProject.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.northWind.northWindProject.business.abstracts.IOrdersService;
import com.northWind.northWindProject.entities.conretes.Orders;

@RestController
@RequestMapping("api/v1")
public class OrdersController {
	@Autowired
	IOrdersService ordersService;
	
	@PostMapping("/cart/addProductsCart/{customerId},{productId}")
	public Orders insertOrder(@PathVariable(value = "customerId")String customerId,
			@PathVariable (value = "productId") int productId,
            @RequestBody Orders orders) {  
		return ordersService.insertOrder(customerId, productId);
	}

}
