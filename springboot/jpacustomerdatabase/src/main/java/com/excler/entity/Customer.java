package com.excler.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	private int id;
	private String name;
	private long phno;
	private String address;
	private int raiting;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String name, int price, String category, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.phno = price;
		this.address = category;
		this.raiting = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRaiting() {
		return raiting;
	}
	public void setRaiting(int raiting) {
		this.raiting = raiting;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phno=" + phno + ", address=" + address + ", raiting="
				+ raiting + ", getId()=" + getId() + ", getName()=" + getName() + ", getPhno()=" + getPhno()
				+ ", getAddress()=" + getAddress() + ", getRaiting()=" + getRaiting() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
