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
public class ItemOrderDaoMysql {

//public List<Order> readAll() {
//	ArrayList<Order> orders = new ArrayList<Order>();
//	try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.234.153.182:3306/project_db", Config.username, Config.password)) {
//		Statement statement = connection.createStatement();
//		ResultSet resultSet = statement.executeQuery("select * from orders");
//		while (resultSet.next()) {
//			int id = resultSet.getInt("id");
//			int customerId = resultSet.getInt("customerId");
//			int cost = resultSet.getInt("cost");
//			Order order = new Order(id, customerId, cost);
//			orders.add(order);
//		}
//	} catch (Exception e) {
//		
//	}
	


}