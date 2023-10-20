package com.inventory.springboot.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="ProductTable")
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Product_ID")
	private Long productId;
	
	@Column(name="Product_Name")
	private String productName;
	
	@Column(name="Product_Group")
	private String productGroup;
	
	@Column(name="Product_Price")
	private Float productPrice;
	
	@Column(name="Product_ExpiryDate")
	private Date expiryDate;
	
	// Add a default constructor
    public ProductEntity() {
    }
	
	public ProductEntity(Long productId, String productName, String productGroup, float productPrice,
			Date expiryDate) {
		this.productId = productId;
		this.productName = productName;
		this.productGroup = productGroup;
		this.productPrice = productPrice;
		this.expiryDate = expiryDate;
	}
	
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductGroup() {
		return productGroup;
	}
	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

}
