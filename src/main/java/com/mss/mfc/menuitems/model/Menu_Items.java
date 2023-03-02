package com.mss.mfc.menuitems.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Menu_Items")
@JsonIgnoreProperties(ignoreUnknown = true)

public class Menu_Items {
	@Id
	@GeneratedValue
	private int item_id;
	private String name;
	private String description;
	private double price;
	private int quantity;
	private String is_available;
	private int seller_id;
	private double totalprice;
	
	public Menu_Items(int item_id, String name, String description, double price,  String is_available,
			double totalprice, int quantity) {
		super();
		
		this.item_id = item_id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.is_available = is_available;
		this.totalprice = totalprice;
	}

	

}
