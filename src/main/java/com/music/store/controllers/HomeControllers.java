package com.music.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.music.store.daos.ProductDao;
import com.music.store.entities.Product;

@Controller
public class HomeControllers {

	@Autowired
	private ProductDao productDao;
	
    @RequestMapping("/")
    public String index() {
        return "home/index";
    }

    @GetMapping("/products")
    public String getProducts(Model model) {
    	List<Product> products = productDao.findAll();
    	System.out.println(products);
    	model.addAttribute("products", productDao.findAll());
    	return "products/index";
    }
}
