package org.ncu.Ecommerce.Service;

import java.util.List;

import org.ncu.Ecommerce.Entity.PhysicalProduct;
import org.ncu.Ecommerce.Entity.Product;

public interface ProductService {
	String createProduct(PhysicalProduct product);

	List<PhysicalProduct> getAllProducts();
}
