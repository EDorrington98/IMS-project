package com.qa.controller;

import org.apache.log4j.Logger;

import com.qa.persistence.domain.Customer;
import com.qa.services.CrudServices;
import com.qa.utils.Utils;

public class CustomerController implements CrudController<Customer>{

	public static final Logger LOGGER = Logger.getLogger(CustomerController.class);
	
	private CrudServices<Customer> customerService;
	
	public CustomerController(CrudServices<Customer> customerService) {
		this.customerService = customerService;
	}
	
	public void readAll() {
		for(Customer customer: customerService.readAll()) {
			LOGGER.info(customer.toString());
		}
	}

	public void create() {
		LOGGER.info("Please enter a champion name");
		String name = Utils.getInput();
		LOGGER.info("Please enter a champion role");
		String role = Utils.getInput();
		customerService.create(new Customer(name, role));
		LOGGER.info("Customer created");
	}

	public void update() {
		LOGGER.info("Please enter a champion name to update");
		String name = Utils.getInput();
		LOGGER.info("Please enter a champion role to update");
		String role = Utils.getInput();
		LOGGER.info("For which ID?");
		int id = Utils.getInt(); 
		customerService.update(id, new Customer(name, role));
		LOGGER.info("Customer updated");
		
	}

	public void delete() {
		LOGGER.info("Please enter the id of the champion you want to delete");
		int id = Utils.getInt();
		customerService.delete(id);
		LOGGER.info("Customer deleted");
		
	}
	
}
