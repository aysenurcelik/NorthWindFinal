package com.northWind.northWindProject.api.controllers; 

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.northWind.northWindProject.business.abstracts.ICartService;

import com.northWind.northWindProject.entities.conretes.Cart;


@RestController
@RequestMapping("api/v1")
public class CartController {
	
	@Autowired
	ICartService cartService;
	
	@PostMapping("/cart/addProductsCart/{productId}")
	public Cart addProductsCart(@PathVariable(value = "id")List<Integer> productId,
			@PathVariable (value = "addedId") int addedProdcutId,
            @RequestBody Cart cart) {  
		return cartService.addProductsCart(productId, addedProdcutId);
	}
	
	@DeleteMapping("/cart/removeFromCart/{productId},{custId}")
	public Cart removeFromCart(@PathVariable(value = "id") int custId,
			@PathVariable(value = "id") int productId,
		@PathVariable(value = "id") int removedProductId) {
			return cartService.removeFromCart(custId, productId, removedProductId);
		}
	
	@GetMapping("/cart/listOfCart/{customerId}")
	 public Optional<Cart> listOfCart(@PathVariable(value = "id")String customerId){
		return cartService.listOfCart(customerId);
	}
	
	
	
	
	
		 }
		
	
