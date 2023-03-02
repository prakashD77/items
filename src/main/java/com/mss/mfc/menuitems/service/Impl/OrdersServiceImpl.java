package com.mss.mfc.menuitems.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mss.mfc.menuitems.model.Orders;
import com.mss.mfc.menuitems.repository.OrderRepository;
import com.mss.mfc.menuitems.service.OrdersService;
@Service
public class OrdersServiceImpl implements OrdersService {
	@Autowired
	OrderRepository orderRepository;
	@Override
	public Orders OrderDetails(Orders orders) {
		Orders order = orderRepository.save(orders);
		return order;

	}

	
	

	
}
