package com.excler.entity;

import java.util.List;

import com.excler.entity.Orders.Order;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Table(name ="customer")
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
private String name;
	
	@Column(unique = true, name="email")
	private String email;
	@Column(unique = true , name="contactno")
	private String contactNo;
@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressid" , referencedColumnName = "id")
   private Address address;

@OneToMany(fetch = FetchType.LAZY ,cascade = CascadeType.ALL,mappedBy = Customer)
@JoinColumn(name = "orderid", referencedColumnName = "id")
private List<Order>  order;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}