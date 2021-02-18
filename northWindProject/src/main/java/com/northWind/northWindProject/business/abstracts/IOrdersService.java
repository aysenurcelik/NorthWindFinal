package com.northWind.northWindProject.business.abstracts;
import com.northWind.northWindProject.entities.conretes.Orders;

public interface IOrdersService {
	Orders insertOrder(String customerId,int productId);
}
