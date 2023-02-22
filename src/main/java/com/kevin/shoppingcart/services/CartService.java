package com.kevin.shoppingcart.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.shoppingcart.models.Cart;
import com.kevin.shoppingcart.repository.CartRepository;

@Service
public class CartService {
	@Autowired
	private CartRepository cartServ;
	
//	Create
	public Cart createProduct(Cart N) {
		return cartServ.save(N);
	}
//	FIND BY ID
	public Cart findProduct(Long id) {
		Optional<Cart> option = cartServ.findById(id);
		if(option.isPresent()) {
			return option.get();
		}else {
			return null;
		}
	}
//	DELTE 
	public void deleteProduct(Long id) {
		cartServ.deleteById(id);
	}
}
