package com.northWind.northWindProject.dataaccess.concretes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.northWind.northWindProject.entities.conretes.Orders;
@Repository
public interface OrdersRepository extends JpaRepository<Orders, String> {
	
	@Query(value = "SELECT O.customer_id, C.product_id FROM orders O, cart C WHERE  O.customer_id = C.product_id"
			,nativeQuery = true) String getProductInCart(String customerId);

}
