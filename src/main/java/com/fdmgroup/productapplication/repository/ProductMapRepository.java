package com.fdmgroup.productapplication.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.fdmgroup.productapplication.model.Product;


@Repository
public class ProductMapRepository {

	private Map<Integer,Product> products;
	
	public ProductMapRepository() {
		products = new HashMap<>();
	}
	
	public void save(Product product) {
		products.put(product.getId(), product);
	}
	
}
