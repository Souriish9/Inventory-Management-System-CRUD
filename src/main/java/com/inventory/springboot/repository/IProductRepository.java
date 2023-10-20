package com.inventory.springboot.repository;

import com.inventory.springboot.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProductRepository extends JpaRepository<ProductEntity, Long> {

}
