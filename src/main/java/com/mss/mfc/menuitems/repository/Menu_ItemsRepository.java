package com.mss.mfc.menuitems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mss.mfc.menuitems.model.Menu_Items;

public interface Menu_ItemsRepository extends JpaRepository<Menu_Items, Integer> {


	public void save(int item_id);
}

