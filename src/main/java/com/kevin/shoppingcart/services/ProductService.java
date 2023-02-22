package com.kevin.shoppingcart.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.shoppingcart.models.Product;
import com.kevin.shoppingcart.repository.ProductRepository;


@Service
public class ProductService {
	@Autowired
	private ProductRepository productsServ;

//	Find all
	public List<Product>allProducts(){
		return productsServ.findAll();
	}
//	Create
	public Product createProduct(Product N) {
		return productsServ.save(N);
	}
//	FIND BY ID
	public Product findProduct(Long id) {
		Optional<Product> option = productsServ.findById(id);
		if(option.isPresent()) {
			return option.get();
		}else {
			return null;
		}
	}
//	DELTE 
	public void deleteProduct(Long id) {
		productsServ.deleteById(id);
	}
//	Update
	public Product updateProduct(Long id,String name, Integer price, Integer stock) {
		Product products = productsServ.findById(id).get();
		products.setName(name);
		products.setPrice(price);
		products.setStock(stock);

		return productsServ.save(products);
				
	}

}
