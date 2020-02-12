package com.qa.controller;

	import org.apache.log4j.Logger;

	import com.qa.persistence.domain.Order;
	import com.qa.services.CrudServices;
	import com.qa.utils.Utils;

	public class OrderController implements CrudController<Order>{

		public static final Logger LOGGER = Logger.getLogger(OrderController.class);
		
		private CrudServices<Order> orderService;
		
		public OrderController(CrudServices<Order> orderService) {
			this.orderService = orderService;
		}
		
		public void readAll() {
			for(Order order: orderService.readAll()) {
				LOGGER.info(order.toString());
			}
		}
//
		public void create() {
			LOGGER.info("Please enter the Customer ID tied to this order");
			int customerId = Utils.getInt();
			orderService.create(new Order(customerId));
			LOGGER.info("Order created");
		}

		public void update() {
			LOGGER.info("Please enter an order's name to update");
			int customerId = Utils.getInt();
			LOGGER.info("Please enter an order value to update");
			int cost = Utils.getInt();
			LOGGER.info("For which ID?");
			int id = Utils.getInt(); 
			orderService.update(id, new Order(customerId));
			LOGGER.info("Order updated");
			
		}

		public void delete() {
			LOGGER.info("Please enter the id of the order you want to delete");
			int id = Utils.getInt();
			orderService.delete(id);
			LOGGER.info("Order deleted");
			
		}
		
	}
