package com.northWind.northWindProject.entities.conretes;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.northWind.northWindProject.entities.abstracts.IEntity;

import lombok.Data;


@Entity
@Table(name="cart")
@Data

public class Cart implements IEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cart_id")
	int cartId;
	@Column(name="product_id")
	int prodcutId;
	@Column(name="customer_id")
	String customerId;
	public int custId = Integer.parseInt(customerId); 
	@Column(name="quantity")
	int quantity;
	@Column(name="item_cost")
	String cartItemCost; 
	@Column(name ="item_name")
	String itemName;

	
	
	
	
}
