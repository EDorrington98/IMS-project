package com.qa.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.qa.persistence.domain.Customer;

@SuppressWarnings("unused")
public class CustomerTest {
	
	private Customer customer;
	private Customer other;
	
	@Before
	public void setUp() {
		customer = new Customer("Chris", "Mid");
		other = new Customer("Chris", "Mid");
	}
	 
	@SuppressWarnings({ "null", "unused" })
	@Test
	public void settersTest() {
		assertNotNull(customer.getId());
		assertNotNull(customer.getName());
	
	}
	
	@Test
	public void equalsWithNull() {
		assertFalse(customer.equals(null));
	}
	
		

	@Test
	public void equalsWithDifferentObject() {
		assertFalse(customer.equals(new Object()));
	}
	
	
	@Test
	public void checkEquality() {
		assertTrue(customer.equals(customer));
	}
	
	@Test
	public void checkEqualityBetweenDifferentObjects() {
		assertFalse(customer.equals(other));
	}
	
	@Test
	public void customerNameNullButOtherNameNotNull() {
		customer.setName(null);
		assertFalse(customer.equals(other));
	}
	
	@Test
	public void customerNamesNotEqual() {
		other.setName("rhys");
		assertFalse(customer.equals(other));
	}
	
	@Test
	public void checkEqualityBetweenDifferentObjectsNullName() {
		customer.setName(null);
		other.setName(null);
		assertFalse(customer.equals(other));
	}
	
	@SuppressWarnings("null")
	@Test
	public void nullId() {
		customer.setId((Integer) null);
		assertFalse(customer.equals(other));
	}
	
	@SuppressWarnings("null")
	@Test
	public void nullIdOnBoth() {
		customer.setId((Integer) null); 
		other.setId((Integer) null);
		assertFalse(customer.equals(other));
	}
	
	@Test
	public void otherIdDifferent() {
		other.setId((int) 2L);
		assertFalse(customer.equals(other));
	}
	
	@Test
	public void nullSurname() {
		customer.setSurname(null);
		assertFalse(customer.equals(other));
	}
	
	@Test
	public void nullSurnameOnBoth() {
		customer.setSurname(null);
		other.setSurname(null);
		assertFalse(customer.equals(other));
	}
	
	@Test
	public void otherSurnameDifferent() {
		other.setSurname("thompson");
		assertFalse(customer.equals(other));
	}
	
	
	
	@Test
	public void toStringTest() {
		String toString = "id:0 name:Chris role:Mid";
		assertEquals(toString, customer.toString());
	}
}