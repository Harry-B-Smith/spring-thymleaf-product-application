package com.fdmgroup.productapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.productapplication.model.Product;
import com.fdmgroup.productapplication.repository.ProductMapRepository;


@Service
public class ProductMapService implements ProductService {
	
	private ProductMapRepository productRepository;
	
	
	@Autowired
	public ProductMapService(ProductMapRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public boolean createProduct(Product product) {
		productRepository.save(product);
		return true;
	}	
	
}
