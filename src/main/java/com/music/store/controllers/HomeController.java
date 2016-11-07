package com.music.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.music.store.entities.Product;
import com.music.store.services.ProductService;

@Controller
public class HomeController {
	
	private ProductService productService;
	
	@Autowired(required = true)
	@Qualifier(value = "productService")
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "home/index";
	}
	
	@GetMapping("/products")
	public String getProducts(Model model) {
		List<Product> products = productService.findAll(); 
		model.addAttribute("products", products);
		return "products/index";
	}
	
}
