package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Service.ProductService;
import com.model.Product;

@RestController
public class ProductController {
	@Autowired
	ProductService pservice;

	// Get all products
	@GetMapping("/products")
	public List<Product> getproduct() {
		return pservice.getallproducts();
	}

	// update product
	@PostMapping("/product")
	public void Updateproducts(@RequestBody Product product) {
		pservice.addproduct(product);
	}

	// delete product by Id
	@DeleteMapping("/product/{id}")
	public void deleteproducts(@PathVariable Integer id) {
		pservice.deleteProduct(id);
	}
}
