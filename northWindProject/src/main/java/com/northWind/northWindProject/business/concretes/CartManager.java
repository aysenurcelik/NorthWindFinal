package com.northWind.northWindProject.business.concretes;


import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.northWind.northWindProject.business.abstracts.ICartService;
import com.northWind.northWindProject.dataaccess.concretes.CartRepository;
import com.northWind.northWindProject.dataaccess.concretes.OrderDetailsRepository;
import com.northWind.northWindProject.dataaccess.concretes.OrdersRepository;
import com.northWind.northWindProject.entities.conretes.Cart;


@Service
public class CartManager implements ICartService{
	@Autowired
	CartRepository cartRepository; 
	@Autowired
	Cart cart;
	
	public int findProductId(int productId) { 
		return cartRepository.findProductsId(productId);
}
	public int findCustomerId(int custId) {
		return cartRepository.findCustomerId(custId);
}
	
	@Override
	public Cart addProductsCart(List<Integer> productId,int addedProductId) {
		if(
		findProductId(addedProductId)==1)
			cart.setQuantity(addedProductId++);
		else cartRepository.save(cart);
		return cart;
		}
	
	@Override
	public Cart removeFromCart(int custId, int productId, int removedProductId) {
		if(
		findCustomerId(custId)==1) {
			if(findProductId(removedProductId)==1); 
			 cartRepository.deleteById(removedProductId);
		}return cart;}
	
	
	@Override
	public Optional<Cart> listOfCart(String customerId) {
	    Optional<Cart> cartOwnerList= cartRepository.findById(cart.custId);
	    if(cartOwnerList.isEmpty())
	    		System.out.println("cart is empty");
	    else{
	    	return cartOwnerList;
	    }
		
		return cartOwnerList; }}
