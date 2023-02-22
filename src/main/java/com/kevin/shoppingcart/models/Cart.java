package com.kevin.shoppingcart.models;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer total;
	
	private Integer quantity;
	
	

	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	
	private User user;
	
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
	name = "product_cart", 
	joinColumns = @JoinColumn(name = "cart_id"), 
	inverseJoinColumns = @JoinColumn(name = "product_id")
	)

	private List<Product> product;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}
	


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	
}
