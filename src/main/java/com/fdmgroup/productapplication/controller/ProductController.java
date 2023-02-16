package com.fdmgroup.productapplication.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fdmgroup.productapplication.model.Product;
import com.fdmgroup.productapplication.service.ProductService;

@Controller
public class ProductController {
	
	ProductService productService;
	
	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
//	@RequestMapping("/")
//	public String toIndex(HttpSession session) {
//		System.out.println(session.getAttribute("username"));
//		return "index";
//	}
	
	@RequestMapping("/")
	public String toIndex() {
		return "index";
	}
	
	@GetMapping("/addProduct")
	public String toCreateProduct(Model model, @Autowired Product product) {
		
		model.addAttribute("product",product);
		
		return "add-product";
	}
	
//	@PostMapping("/process")
//	public String processNewProduct(@RequestParam String name, @RequestParam String description, 
//			@RequestParam String make, @RequestParam String supplier, @RequestParam double price) {
//		
//		//double doublePrice = Double.parseDouble(price);
//		Product myProduct = new Product(name, description, make, supplier, price);
//		System.out.println(myProduct);
//		
//		productService.createProduct(myProduct);
//		
//		return "confirmation-page";
//	}
	
	// Creating new products using Form Binding -- A product is bound to the form
    @PostMapping("/process")
    public String processNewProduct(Product product) {
        productService.createProduct(product);
        return "confirmation-page";
    }

	
	@GetMapping("/login")
	public String goToLogin() {
		return "login";
	}

}
