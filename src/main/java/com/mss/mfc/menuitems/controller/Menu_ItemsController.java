package com.mss.mfc.menuitems.controller;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mss.mfc.menuitems.constants.MappingConstants;
import com.mss.mfc.menuitems.model.Menu_Items;
import com.mss.mfc.menuitems.service.Menu_ItemsService;
import com.mss.mfc.menuitems.service.Impl.Menu_ItemsServiceImpl;

@RestController
@CrossOrigin("*")
public class Menu_ItemsController {
	@Autowired
	Menu_ItemsService itemsService;
	@Autowired
	Menu_ItemsServiceImpl itemsServiceImpl;

//	@PostMapping(value = MappingConstants.ITEMS)
//	public Menu_Items Additems(@RequestBody Menu_Items menu_Items) {
//		return itemsService.Additems(menu_Items);
//	}

	
	@PostMapping(value = MappingConstants.ITEMS)
	public Menu_Items placeorder(@RequestBody Menu_Items items) {
		return itemsService.placeorder(items);
	}

	@GetMapping(value = MappingConstants.GETITEMDETAILS)
	public List<Menu_Items> getItems() {
		return itemsService.getItems();
	}

//	@GetMapping(value = MappingConstants.SHOW)
//	public List<Menu_Items> show() {
//		return itemsService.show();
//	}

//	@PutMapping(value = MappingConstants.UPDATE)
//	public Menu_Items updateitem(@RequestBody Menu_Items items,@PathVariable int selller_id) {
//		return itemsService.updateitem(items,selller_id);
//	}
//	

	@PutMapping(value = MappingConstants.UPDATE)
	public String update(@RequestBody Menu_Items items) {
		return itemsService.update(items);
	}

}