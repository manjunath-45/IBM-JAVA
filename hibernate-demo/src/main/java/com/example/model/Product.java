package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="Product")
@Entity
@ToString



public class Product {
	
	@Id
	@Column(name="product_id")
	private int productId;
	@Column(name="product_name")
	private  String productName;
	@Column(name="product_price")
	private double productPrice;
	public Product(String productName, double productPrice, int productId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
}
