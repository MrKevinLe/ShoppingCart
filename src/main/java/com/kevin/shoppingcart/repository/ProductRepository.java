package com.kevin.shoppingcart.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kevin.shoppingcart.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product>findAll();

}
