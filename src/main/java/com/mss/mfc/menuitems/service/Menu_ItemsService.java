package com.mss.mfc.menuitems.service;

import java.util.List;

import com.mss.mfc.menuitems.model.Menu_Items;

public interface Menu_ItemsService {
	public Menu_Items Additems(Menu_Items menu_Items);

	public List<Menu_Items> getItems();

//	public List<Menu_Items> show();

	public Menu_Items updateitem(Menu_Items items, int selller_id);

	public String update(Menu_Items items);

	public Menu_Items placeorder(Menu_Items items);

}
