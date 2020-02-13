package com.qa.persistence.domain;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.qa.persistence.domain.Item;

public class ItemTest {

	private Item item;
	private Item other;

	@Before
	public void setUp() {
		item = new Item("apple", 12);
		other = new Item("apple", 12);
	}


	@Test
	public void equalsWithNull() {
		assertFalse(item.equals(null));
	}

	@Test
	public void equalsWithDifferentObject() {
		assertFalse(item.equals(new Object()));
	}


	@Test
	public void checkEquality() {
		assertTrue(item.equals(item));
	}

	@Test
	public void checkEqualityBetweenDifferentObjects() {
		assertFalse(item.equals(other));
	}

	@Test
	public void itemNameNullButOtherNameNotNull() {
		item.setName(null);
		assertFalse(item.equals(other));
	}

	@Test
	public void itemNamesNotEqual() {
		other.setName("banana");
		assertFalse(item.equals(other));
	}

	@Test
	public void checkEqualityBetweenDifferentObjectsNullName() {
		item.setName(null);
		other.setName(null);
		assertFalse(item.equals(other));
	}



	@Test
	public void otherItemIdDifferent() {
		other.setId(2);
		assertFalse(item.equals(other));
	}

	@Test
	public void otherValueDifferent() {
		other.setValue(30);
		assertFalse(item.equals(other));
	
	}

	@SuppressWarnings("unused")
	@Test
	public void constructorWithoutItemId() {
		Item item = new Item("apple", 12);
		assertNotNull(item.getId());
		assertNotNull(item.getName());
	}
}