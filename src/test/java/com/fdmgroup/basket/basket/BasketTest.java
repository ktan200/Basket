package com.fdmgroup.basket.basket;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.fdmgroup.basket.item.Item;

public class BasketTest {

	private Basket testObject;
	private List<Item> items;
	private List<Item> expectedList;

	@Mock
	private Item apple;
	@Mock
	private Item banana;

	@Before
	public void setUpBeforeClass() throws Exception {
		MockitoAnnotations.initMocks(this);
		items = new ArrayList<Item>();
		testObject = new Basket(items);
		when(apple.getPrice()).thenReturn(2);
		when(banana.getPrice()).thenReturn(3);
		expectedList = new ArrayList<Item>();
		expectedList.add(apple);
		expectedList.add(banana);
	}

	@Test
	public void testEmptyBasket() {
		assertThat(items, (IsEmptyCollection.empty()));

	}

	@Test
	public void testAddMethod() {
		testObject.addItem(apple);
		testObject.addItem(banana);
		assertThat(items, hasItem(apple));
	}

	@Test
	public void testDeleteMethod() {
		testObject.addItem(banana);
		assertThat(items, hasItem(banana));
		testObject.deleteItem(banana);
		assertThat(items, (IsEmptyCollection.empty()));

	}

}
