package com.product.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.Repository.ProductRepository;
import com.product.model.Product;

@Service
public class ProductService {
	@Autowired
	ProductRepository repo;

	// crud operations

	// create product
	public void saveProduct(Product product) {
		repo.save(product);
	}

	// get all product
	public List<Product> getProducts() {
		return repo.findAll();
	}

	// update products
	public void updateProduct(Product product) {
		repo.save(product);
	}

	// delete product
	public void deleteProduct(Integer id) {
		repo.deleteById(id);
	}
}
