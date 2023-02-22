package com.kevin.shoppingcart.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kevin.shoppingcart.models.Cart;

public interface CartRepository extends CrudRepository<Cart, Long> {
	List<Cart>findAll();

}
