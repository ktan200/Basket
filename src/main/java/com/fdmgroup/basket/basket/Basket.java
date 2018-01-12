package com.fdmgroup.basket.basket;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.basket.item.Item;

public class Basket {

	private List<Item> items;

	public Basket(List<Item> items) {
		this.items = items;
	}

	public Basket() {
		items = new ArrayList<>();
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public void deleteItem(Item item) {
		items.remove(item);
	}

}