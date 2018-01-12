package com.fdmgroup.basket.basket;

import com.fdmgroup.basket.item.Item;

public class CheckOut implements CostCalculation {

	public int calculateTotal(Basket basket) {
		int total = 0;
		for (Item i : basket.getItems()) {

			total += i.getPrice();
		}
		return total;

	};
}