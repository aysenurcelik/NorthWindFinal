package com.northWind.northWindProject.dataaccess.concretes;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.northWind.northWindProject.entities.conretes.OrderDetails;

@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer>{
	
	@Query(value = "SELECT * FROM orders", nativeQuery = true) 
	 int getOrders(int orderId);
}
