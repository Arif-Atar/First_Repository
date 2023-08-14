package com.example.CRUD_API_PRODUCT.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CRUD_API_PRODUCT.Dao.ProductDao;
import com.example.CRUD_API_PRODUCT.Entity.Product;

@Service
public class ProductService {
	@Autowired
	ProductDao dao;

	public List<Product> getAllProduct() {

		List<Product> Product= dao.getAllProduct();
		return Product;
	}

	public boolean insertProduct(Product product) {
	
		return dao.insertProduct(product);
	}

	public Product getProductById(int productId) {
		return dao .getProductById(productId);
	}

	public boolean deleteProductById(int productId) {
				return dao.deletePlayerById(productId);
		
	}

	public Product updateProduct(Product product ) {
		return dao.updateProduct(product);
		
	}

}
