package com.example.CRUD_API_PRODUCT.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.CRUD_API_PRODUCT.Entity.Product;

@Repository
public class ProductDao {

	@Autowired
	SessionFactory sf;

	public List<Product> getAllProduct() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Product.class);
		List<Product> product = criteria.list();
		session.close();
		return product;

	}

	public boolean insertProduct(Product product) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		System.out.println(product);
		session.save(product);
		tr.commit();
		session.close();
		return true;
	}

	public Product getProductById(int productId) {
		Session session = sf.openSession();
		Product product = session.get(Product.class, productId);
		session.close();
		return product;
	}

	public boolean deletePlayerById(int productId) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Product product = session.get(Product.class, productId);
		session.delete(product);
		tr.commit();
		session.close();
		return true;

	}

	public Product updateProduct(Product product) {
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.update(product);

		tx.commit();

		return product;

	}

}
