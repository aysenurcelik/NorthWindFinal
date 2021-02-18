package com.northWind.northWindProject.entities.conretes;


import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.northWind.northWindProject.entities.abstracts.IEntity;

import lombok.Data;
@Entity
@Table(name="orders")
@Data
public class Orders implements IEntity { 
	
	
	@Column(name="order_id")
    int orderId;
	
	@Column(name="order_date")
    Date orderDate; 
	
	@Column(name="customer_id")
    String customerId;
	
	@Column(name="cart_id")
    int cartId; 
	
	}
