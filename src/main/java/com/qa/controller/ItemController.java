package com.qa.controller;

	import org.apache.log4j.Logger;

	import com.qa.persistence.domain.Item;
	import com.qa.services.CrudServices;
	import com.qa.utils.Utils;

	public class ItemController implements CrudController<Item>{

		public static final Logger LOGGER = Logger.getLogger(ItemController.class);
		
		private CrudServices<Item> itemService;
		
		public ItemController(CrudServices<Item> itemService) {
			this.itemService = itemService;
		}
		
		public void readAll() {
			for(Item item: itemService.readAll()) {
				LOGGER.info(item.toString());
			}
		}

		public void create() {
			LOGGER.info("Please enter the item name");
			String name = Utils.getInput();
			LOGGER.info("Please enter the item's value");
			int value = Utils.getInt();
			itemService.create(new Item(name, value));
			LOGGER.info("item created");
		}

		public void update() {
			LOGGER.info("Please enter an item's name to update");
			System.out.println("Hi Elliot it's your boi breaking all of your code lol");
			System.out.println("Please don't delete these lines it would be really funny");
			System.out.print(" if Chris found these messages");
			String name = Utils.getInput();
			LOGGER.info("Please enter an item value to update");
			int value = Utils.getInt();
			LOGGER.info("For which ID?");
			int id = Utils.getInt(); 
			itemService.update(id, new Item(name, value));
			LOGGER.info("Item updated");
			
		}

		public void delete() {
			LOGGER.info("Please enter the id of the item you want to delete");
			int id = Utils.getInt();
			itemService.delete(id);
			LOGGER.info("Item deleted");
			
		}
		
	}
