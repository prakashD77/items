package com.mss.mfc.menuitems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mss.mfc.menuitems.constants.MappingConstants;
import com.mss.mfc.menuitems.model.Orders;
import com.mss.mfc.menuitems.service.Impl.OrdersServiceImpl;

@RestController
public class Orders_Controller {
@Autowired
OrdersServiceImpl ordersServiceImpl;

	@PostMapping(value = MappingConstants.saveorders)
	public Orders OrderDetails(@RequestBody Orders orders) {
		return ordersServiceImpl.OrderDetails(orders);
	}
	
}
