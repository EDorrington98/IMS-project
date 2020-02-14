package com.qa.services;


	import org.junit.Test;
	import org.junit.runner.RunWith;
	import org.mockito.InjectMocks;
	import org.mockito.Mock;
	import org.mockito.Mockito;
	import org.mockito.Spy;
	import org.mockito.junit.MockitoJUnitRunner;

	import com.qa.persistence.dao.Dao;
	import com.qa.persistence.domain.Customer;

	@RunWith(MockitoJUnitRunner.class)
	public class CustomerServicesIT {
		@Mock
		private Dao<Customer> customerDao;
		
		@InjectMocks
		private CustomerServices customerServices;
		
		@Test
		public void customerServicesCreate() {
			Customer customer = new Customer("Corki", "Mid");
			customerServices.create(customer);
			Mockito.verify(customerDao, Mockito.times(1)).create(customer);
		}
		
		@Test
		public void customerServicesRead() {
			customerServices.readAll();
			Mockito.verify(customerDao, Mockito.times(1)).readAll();
		}
		
		@Test
		public void customerServicesUpdate() {
			Customer customer = new Customer("Corki", "Mid");
			customerServices.update(0, customer);
			Mockito.verify(customerDao, Mockito.times(1)).update(0, customer);
		}
		
		@Test
		public void customerServicesDelete() {
			customerServices.delete(1);;
			Mockito.verify(customerDao, Mockito.times(1)).delete(1);
		}
}