package com.product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.Service.ProductService;
import com.product.model.Product;

@RestController
public class ProductController {
	@Autowired
	ProductService pserv;

	// CRUD APi
	// url:Localhost:8080/apis/products

	// get all products
	@GetMapping("/products")
	public List<Product> getproducts() {
		return pserv.getProducts();
	}

	// update api
	@PostMapping("/product")
	public void addproduct(@RequestBody Product product) {
		pserv.saveProduct(product);
	}

	// delete api product
	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable Integer id) {
		pserv.deleteProduct(id);
	}
}
