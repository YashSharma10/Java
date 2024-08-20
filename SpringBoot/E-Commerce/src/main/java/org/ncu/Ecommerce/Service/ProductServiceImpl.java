package org.ncu.Ecommerce.Service;

import java.util.List;

import org.ncu.Ecommerce.Dao.ProductDao;
import org.ncu.Ecommerce.Entity.PhysicalProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDao productDao;
	
	@Override
	public String createProduct(PhysicalProduct product) {
		productDao.saveProduct(product);
		return "Movie saved successfully!!!";
	}

	@Override
	public List<PhysicalProduct> getAllProducts() {
		return productDao.getAllProducts();
	}

}
