package com.qa.persistence.domain;

	public class Order {
		private int id;
		private int customerId;
		private int cost;
		
		public Order(int customerId) {
			this.customerId = customerId;
		}

		public Order(int id, int customerId, int cost) {
			this.id = id;
			this.customerId = customerId;
			this.cost = cost;
		}


		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public int getCost() {
			return cost;
		}

		public void setCost(int cost) {
			this.cost = cost;
		}
		
		@Override
		public String toString() {
			return "id:" + id + " customerId:" + customerId + " cost:" + cost;
		}

	}

