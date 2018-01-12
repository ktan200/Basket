package com.fdmgroup.basket.checkOut;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.fdmgroup.basket.basket.Basket;
import com.fdmgroup.basket.basket.CheckOut;
import com.fdmgroup.basket.item.Item;

public class CheckOutTest {

	private CheckOut testObject;
	private List<Item> items;

	@Mock
	private Item apple;
	@Mock
	private Item banana;

	@Before
	public void setUpBeforeClass() throws Exception {
		MockitoAnnotations.initMocks(this);
		items = new ArrayList<Item>();
		testObject = new CheckOut();
		when(apple.getPrice()).thenReturn(2);
		when(banana.getPrice()).thenReturn(3);

	}

	@Test
	public void testGetCost() {
		Basket basket = mock(Basket.class);
		items.add(apple);
		items.add(banana);
		when(basket.getItems()).thenReturn(items);
		assertEquals(5, testObject.calculateTotal(basket));
	}

	@Test
	public void testZeroCostCheckOut() {
		Basket basket = mock(Basket.class);
		when(basket.getItems()).thenReturn(items);
		assertEquals(0, testObject.calculateTotal(basket));

	}

}
