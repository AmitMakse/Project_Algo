package com.org.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.Entity.Product;
import com.org.Entity.Product_category;
import com.org.Services.Product_Service;

@RestController
public class Product_Controller {

	@Autowired
	private Product_Service P_S;
	
	//Create all handlers----->
	
	@PostMapping("/product_category")
	public void addProduct(@RequestBody Product_category p_c) {
		this.P_S.AddProduct(p_c);
	}
	
	
	@GetMapping("/product")
	public ResponseEntity<List<Product_category>> getproduct(){
		
		List<Product_category> list = P_S.getAllProducts();
		return ResponseEntity.of(Optional.of(list));
	}
	
	
	//new Product handler
	@PostMapping("/newProduct")
	public Product_category addproduct(@RequestBody Product_category product_category) {
		Product_category p = this.P_S.addProduct(product_category);
		return p;
	}
	
	
	//delete Product handler
	@DeleteMapping("/Product/{productid}")
	public void deleteproduct(@PathVariable("productid") String product) {
		this.P_S.deleteProduct(product);
		
	}
	
//	@PutMapping("/products/{productid")
//	public Product_category updatebook(@RequestBody Product_category product,@PathVariable("productid") int productid) {
//		this.P_S.UpdateProduct(product, productid);
//		return product;
//	}
//	
	
	
}
