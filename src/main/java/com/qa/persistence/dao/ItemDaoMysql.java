package com.qa.persistence.dao;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;

	import org.apache.log4j.Logger;

	import com.qa.controller.ItemController;
	import com.qa.persistence.domain.Item;
	import com.qa.utils.Config;

	public class ItemDaoMysql implements Dao<Item> {
		
		public static final Logger logger = Logger.getLogger(ItemController.class);
		
		public List<Item> readAll() {
			ArrayList<Item> items = new ArrayList<Item>();
			try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.234.153.182:3306/project_db", Config.username, Config.password)) {
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select * from items");
				while (resultSet.next()) {
					int id = resultSet.getInt("id");
					String name = resultSet.getString("name");
					int value = resultSet.getInt("value");
					Item item = new Item(id, name, value);
					items.add(item);
				}
			} catch (Exception e) {
				
			}
			return items;
		}

		public void create(Item item) {
			try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.234.153.182:3306/project_db", Config.username, Config.password)){
				Statement statement = connection.createStatement();
				statement.executeUpdate("INSERT into items(name, value) values('" + item.getName() + "','" + item.getValue()+"')");
			} catch (Exception e) {
				
			} 
		}

		public void update(int id, Item item) {
			try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.234.153.182:3306/project_db", Config.username, Config.password)){
				Statement statement = connection.createStatement();
				statement.executeUpdate("UPDATE items SET name ='" + item.getName() + "' , value = '" + item.getValue() + "' WHERE id =" + id);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void delete(int id) {
			try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.234.153.182:3306/project_db", Config.username, Config.password)){
				Statement statement = connection.createStatement();
				statement.executeUpdate("DELETE from items WHERE id =" + id);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}





	}


