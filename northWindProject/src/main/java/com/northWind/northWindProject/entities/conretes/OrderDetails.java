package com.northWind.northWindProject.entities.conretes;



import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.Table;

import com.northWind.northWindProject.entities.abstracts.IEntity;

import lombok.Data;

@Entity
@Table(name="order_details")
@Data

public class OrderDetails implements IEntity{ 
	

	@Column(name="order_id" ,insertable = false,updatable = false)
	int orderId;
	
	@Column(name="product_id", insertable = false,updatable = false)
	 int productId;
	
	@Column(name="customer_id")
	 String customerId;
	
	@Column(name="cart_id")
	 int cartId; 
	
	@Column(name="unite_price")
      int unitePrice;
	
}
