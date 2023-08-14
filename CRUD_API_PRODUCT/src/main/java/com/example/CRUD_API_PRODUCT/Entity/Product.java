package com.example.CRUD_API_PRODUCT.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	private float version;
	private int productId;
	private String name;
	private long price;
	
	
	public float getVersion() {
		return version;
	}
	public void setVersion(float version) {
		this.version = version;
	}
	@Id
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [version=" + version + ", productId=" + productId + ", name=" + name + ", price=" + price + "]";
	}
	
}
