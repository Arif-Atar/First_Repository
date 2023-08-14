package com.example.CRUD_API_PRODUCT.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CRUD_API_PRODUCT.Entity.Product;
import com.example.CRUD_API_PRODUCT.Service.ProductService;
@RestController
public class ProductController {

	@Autowired
	ProductService service;

	// Get Product
	@GetMapping("/all/product")
	public List<Product> getAllProduct() {
		List<Product> product = service.getAllProduct();
		return product;
	}

	// Add Product
	@PostMapping("/add/product")
	public boolean insertProduct(@RequestBody Product product) {
		return service.insertProduct(product);

	}

	// Get Product BY Id
	@GetMapping("product/{productId}")
	Product getProductById(@PathVariable int productId) {
		Product product = service.getProductById(productId);
		return product;
	}

    //Delete Product By Id
	@DeleteMapping("delete/{productId}")
	public boolean deletePlayerById(@PathVariable int productId) {
		return service.deleteProductById(productId);
	}
	// Update Product
	@PutMapping("update")
	public Product updateProduct(@RequestBody Product product)
    {
    	return service.updateProduct(product);
    }

}
