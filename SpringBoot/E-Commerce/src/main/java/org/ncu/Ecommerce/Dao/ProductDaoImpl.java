package org.ncu.Ecommerce.Dao;

import java.util.List;

import org.ncu.Ecommerce.Entity.PhysicalProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
@Repository
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
    EntityManager entityManager;
	@Override
	public void saveProduct(PhysicalProduct product) {
		entityManager.persist(product);
		
	}

	@Override
	public List<PhysicalProduct> getAllProducts() {
		return entityManager.createQuery("SELECT m FROM Movie m", PhysicalProduct.class).getResultList();
	}

}
