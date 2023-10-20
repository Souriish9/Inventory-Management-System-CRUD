package com.inventory.springboot.service.impl;

import com.inventory.springboot.entity.ProductEntity;
import com.inventory.springboot.service.ProductService;
import com.inventory.springboot.repository.IProductRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	IProductRepository productRepository;

	@Override
	public List<ProductEntity> findAllProducts() {
		System.out.println("hereee!");
		return productRepository.findAll();
	}

	@Override
	public Optional<ProductEntity> findProductById(Long id) {
		return productRepository.findById(id);
	}

	@Override
	public ProductEntity saveProduct(ProductEntity productEntity) {
		return productRepository.save(productEntity);
	}

	@Override
	public ProductEntity updateProduct(ProductEntity productEntity) {
		return productRepository.save(productEntity);
	}

	@Override
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);	
	}

}
