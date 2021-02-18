package com.northWind.northWindProject.business.abstracts;

import java.util.List;

import java.util.Optional;



import com.northWind.northWindProject.entities.conretes.Cart;



public interface ICartService {
	Cart addProductsCart(List<Integer> productId,int addedProdcutId);
	Cart removeFromCart(int custId, int productId,int removedProductId);
	Optional<Cart>  listOfCart(String customerId); 
   
   
}
