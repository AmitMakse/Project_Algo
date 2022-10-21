package com.org.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "Product_category")
public class Product_category {

	@Id
	@GeneratedValue(generator = "assigned")
	@Column(name = "Product_category", nullable = false)
	private String Product_category;
	
	private int Discount;
	private int GST;
	private int Delivery_charge;
	
	@OneToMany
	private Product_category product_category;
	
	public Product_category() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Product_category [Product_category=" + Product_category + ", Discount=" + Discount + ", GST=" + GST
				+ ", Delivery_charge=" + Delivery_charge + ", product_category=" + product_category + "]";
	}

	
	
}
