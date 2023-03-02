package com.mss.mfc.menuitems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mss.mfc.menuitems.model.Orders;

public interface OrderRepository  extends JpaRepository<Orders, Integer>{


}
