package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.Product;
import com.Repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository pRepo;

	// Crud operations

	// Get all items

	public List<Product> getallproducts() {
		return pRepo.findAll();
	}

	// Create product
	public void addproduct(Product product) {
		pRepo.save(product);
	}

	// Update product
	public void updateproduct(Product product) {
		pRepo.save(product);
	}

	// delete product
	public void deleteProduct(Integer id) {
		pRepo.deleteById(id);
	}
}
