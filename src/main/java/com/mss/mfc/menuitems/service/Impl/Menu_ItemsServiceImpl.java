package com.mss.mfc.menuitems.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mss.mfc.menuitems.model.Menu_Items;
import com.mss.mfc.menuitems.repository.Menu_ItemsRepository;
import com.mss.mfc.menuitems.service.Menu_ItemsService;

@Service
public class Menu_ItemsServiceImpl implements Menu_ItemsService {
	@Autowired
	private Menu_ItemsRepository itemsRepository;

	String msg = "success";
	String res = "Fail";

	@Override
	public Menu_Items Additems(Menu_Items menu_Items) {
		return itemsRepository.save(menu_Items);

	}

	@Override
	public List<Menu_Items> getItems() {
		return itemsRepository.findAll();
	}

	@Override
	public Menu_Items updateitem(Menu_Items items, int selller_id) {
		Menu_Items menu = itemsRepository.getById(selller_id);
		menu.setName(items.getName());
		menu.setPrice(items.getPrice());
		menu.setDescription(items.getDescription());
		menu.setIs_available(items.getIs_available());
		menu.setSeller_id(items.getSeller_id());
		Menu_Items menu_items = itemsRepository.save(menu);
		return menu_items;

	}

	@Override
	public String update(Menu_Items items) {
		itemsRepository.save(items);
		return "Data Updated";

	}

	@Override
	public Menu_Items placeorder(Menu_Items items) {
		items.setTotalprice((items.getQuantity() * items.getPrice()));
		Menu_Items item = itemsRepository.save(items);
		return item;

	}
}
