package com.northWind.northWindProject.dataaccess.concretes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.northWind.northWindProject.entities.conretes.Cart;


@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
	@Query(value = "SELECT COUNT(product_id)  from cart where product_id=?1", nativeQuery = true)
    int findProductsId(int product_id);

	@Query(value = "SELECT COUNT(customer_id) from cart where customer_id=?1", nativeQuery = true)
	int findCustomerId(int customer_id);}

