package com.fdmgroup.basket.app;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.basket.basket.Basket;
import com.fdmgroup.basket.basket.CheckOut;
import com.fdmgroup.basket.item.Item;

public class App {

	public static void main(String[] args) {
		List<Item> items = new ArrayList<Item>();
		Basket basket = new Basket(items);
		Item apple = new Item("apple", 2);
		Item banana = new Item("banana", 3);
		Item orange = new Item("orange", 4);
		Item lemon = new Item("lemon", 4);
		Item peach = new Item("peach", 1);

		basket.addItem(peach);
		basket.addItem(peach);
		basket.addItem(lemon);
		basket.addItem(banana);
		basket.addItem(apple);
		basket.addItem(banana);
		basket.addItem(orange);

		CheckOut checkOut = new CheckOut();
		checkOut.calculateTotal(basket);
		System.out.println("Total cost of basket is £" + checkOut.calculateTotal(basket));

	}

}
