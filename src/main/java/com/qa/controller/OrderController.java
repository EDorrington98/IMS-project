//package com.qa.controller;
//
//	import org.apache.log4j.Logger;
//
//	import com.qa.persistence.domain.Item;
//	import com.qa.services.CrudServices;
//	import com.qa.utils.Utils;
//
//	public class OrderController implements CrudController<Order>{
//
//		public static final Logger LOGGER = Logger.getLogger(OrderController.class);
//		
//		private CrudServices<Order> orderService;
//		
//		public OrderController(CrudServices<Order> orderService) {
//			this.orderService = orderService;
//		}
//		
//		public void readAll() {
//			for(Order order: orderService.readAll()) {
//				LOGGER.info(order.toString());
//			}
//		}
//
//		public void create() {
//			LOGGER.info("Please enter the order name");
//			String name = Utils.getInput();
//			LOGGER.info("Please enter the item's value");
//			int value = Utils.getInt();
//			itemService.create(new Item(name, value));
//			LOGGER.info("item created");
//		}
//
//		public void update() {
//			LOGGER.info("Please enter an item's name to update");
//			String name = Utils.getInput();
//			LOGGER.info("Please enter an item value to update");
//			int value = Utils.getInt();
//			LOGGER.info("For which ID?");
//			int id = Utils.getInt(); 
//			itemService.update(id, new Item(name, value));
//			LOGGER.info("Item updated");
//			
//		}
//
//		public void delete() {
//			LOGGER.info("Please enter the id of the item you want to delete");
//			int id = Utils.getInt();
//			itemService.delete(id);
//			LOGGER.info("Item deleted");
//			
//		}
//		
//	}
//
//}