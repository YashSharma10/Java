package org.ncu.Ecommerce.Controller;

import java.util.List;

import org.ncu.Ecommerce.Entity.PhysicalProduct;
import org.ncu.Ecommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
    ProductService productService;
	
	@PostMapping("/save")
    public String saveProduct(@RequestBody PhysicalProduct product) {
        return productService.createProduct(product);
    }

    @GetMapping("/products")
    public List<PhysicalProduct> getAllMovies() {
        return productService.getAllProducts();
    }
}
