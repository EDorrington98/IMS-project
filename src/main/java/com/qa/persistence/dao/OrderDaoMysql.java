package com.qa.persistence.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.qa.controller.OrderController;
import com.qa.persistence.domain.Order;
import com.qa.utils.Config;

public class OrderDaoMysql implements Dao<Order> {
	
	public static final Logger logger = Logger.getLogger(OrderController.class);
	
	public List<Order> readAll() {
		ArrayList<Order> orders = new ArrayList<Order>();
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.234.153.182:3306/project_db", Config.username, Config.password)) {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from orders");
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				int customerId = resultSet.getInt("customers_id");
				int cost = resultSet.getInt("cost");
				Order order = new Order(id, customerId, cost);
				orders.add(order);
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return orders;
	}

	public void create(Order order) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.234.153.182:3306/project_db", Config.username, Config.password)){
			Statement statement = connection.createStatement();
			statement.executeUpdate("INSERT into orders(customers_id) values('" + order.getCustomerId() + "')");
		} catch (Exception e) {
			logger.error(e.getMessage());

		} 
	}

	public void update(int id, Order order) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.234.153.182:3306/project_db", Config.username, Config.password)){
			Statement statement = connection.createStatement();
			statement.executeUpdate("UPDATE orders SET name ='" + order.getCustomerId() + "' , value = '" + order.getCost() + "' WHERE id =" + id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(int id) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.234.153.182:3306/project_db", Config.username, Config.password)){
			Statement statement = connection.createStatement();
			statement.executeUpdate("DELETE from orders WHERE id =" + id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}





}