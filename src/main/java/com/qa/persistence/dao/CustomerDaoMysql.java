package com.qa.persistence.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.qa.controller.CustomerController;
import com.qa.persistence.domain.Customer;
import com.qa.utils.Config;

public class CustomerDaoMysql implements Dao<Customer> {
	
	public static final Logger logger = Logger.getLogger(CustomerController.class);
	
	public List<Customer> readAll() {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.234.153.182:3306/project_db", Config.username, Config.password)) {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from customers");
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String role = resultSet.getString("role");
				Customer customer = new Customer(id, name, role);
				customers.add(customer);
			}
		} catch (Exception e) {
			
		}
		return customers;
	}

	public void create(Customer customer) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.234.153.182:3306/project_db", Config.username, Config.password)){
			Statement statement = connection.createStatement();
			statement.executeUpdate("INSERT into customers(name, role) values('" + customer.getName() + "','" + customer.getRole()+"')");
		} catch (Exception e) {
			
		} 
	}

	public void update(int id, Customer customer) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.234.153.182:3306/project_db", Config.username, Config.password)){
			Statement statement = connection.createStatement();
			statement.executeUpdate("UPDATE customers SET name ='" + customer.getName() + "' , role = '" + customer.getRole() + "' WHERE id =" + id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete(int id) {
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://35.234.153.182:3306/project_db", Config.username, Config.password)){
			Statement statement = connection.createStatement();
			statement.executeUpdate("DELETE from customers WHERE id =" + id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}





}
