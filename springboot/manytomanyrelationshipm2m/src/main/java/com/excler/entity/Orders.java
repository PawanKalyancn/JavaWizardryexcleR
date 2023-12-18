package com.excler.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class Orders {
	
	@Table(name = "order")
	@Entity
	public class Order {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private LocalDate orderdate;
		private int amount;
		private String paymentMode;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public LocalDate getOrderdate() {
			return orderdate;
		}
	public void setOrderdate(LocalDate orderdate) {
			this.orderdate = orderdate;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		public String getPaymentMode() {
			return paymentMode;
		}
		public void setPaymentMode(String paymentMode) {
			this.paymentMode = paymentMode;
		}
		
		
	}
}
