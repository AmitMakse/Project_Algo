package com.org.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Product_id;
	private String Product_name;
	private String Product_type;
	private String Product_category;
	private int Product_price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product [Product_id=" + Product_id + ", Product_name=" + Product_name + ", Product_type=" + Product_type
				+ ", Product_category=" + Product_category + ", Product_price=" + Product_price + "]";
	}
	
	
	
}

