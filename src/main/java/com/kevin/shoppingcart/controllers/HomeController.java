package com.kevin.shoppingcart.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kevin.shoppingcart.models.Product;
import com.kevin.shoppingcart.services.CartService;
import com.kevin.shoppingcart.services.ProductService;
import com.kevin.shoppingcart.services.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService userservice;
	@Autowired
	private ProductService productsServ;
	@Autowired
	private CartService cartServ;
	
	@GetMapping("/")
	public String homepage(Model model) {
		
		List<Product> allProducts = productsServ.allProducts();
		model.addAttribute("allProducts", allProducts);
		
		return "home.jsp";
	}
	
	@GetMapping("/create")
	public String create(@ModelAttribute("product")Product product,
			Model model) {
		model.addAttribute("product", product);
		return "create.jsp";
		
	}
	@PostMapping("/submit")
	public String submitBook(@Valid @ModelAttribute("product")Product product,
								Model model) {
			productsServ.createProduct(product);
			return "redirect:/";
		}
//	DELETE ONE BY ID
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id,
							Model model) {
		Product product = productsServ.findProduct(id);
		model.addAttribute("product", product);
	        productsServ.deleteProduct(id);
	        return "redirect:/";
	    }

//	@GetMapping("/add/{productId}")
//	public String addtoCart(@PathVariable("productId") Long productId) {
//		Product thisproduct = productsServ.findProduct(productId);
//		thisproduct.getCart().add(null)
//	}
	
	

}

