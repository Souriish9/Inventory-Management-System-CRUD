package com.inventory.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.inventory.springboot.service.ProductService;
import com.inventory.springboot.entity.ProductEntity;

@RestController
@RequestMapping("api/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping
	public List<ProductEntity> findAllProduct(){
		return productService.findAllProducts();
	}
	
	@GetMapping("/{id}")
	public Optional<ProductEntity> findProductById(@PathVariable("id")Long id){
		return productService.findProductById(id);
	}
	
	@PostMapping
	public ProductEntity postProduct(@RequestBody ProductEntity productEntity) {
		return productService.saveProduct(productEntity);
	}
	
	@PutMapping
	public ProductEntity updateProduct(@RequestBody ProductEntity productEntity) {
		return productService.updateProduct(productEntity);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable("id")Long id) {
		productService.deleteProduct(id);
	}
}
