package org.ncu.Ecommerce.Dao;

import java.util.List;

import org.ncu.Ecommerce.Entity.PhysicalProduct;

public interface ProductDao {
	void saveProduct(PhysicalProduct product);

	List<PhysicalProduct> getAllProducts();
}
