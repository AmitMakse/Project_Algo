package com.org.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.Entity.Product;
import com.org.Entity.Product_category;
import com.org.Repo.Product_Category_Repo;

@Component
public class Product_Service {

	@Autowired
	private Product_Category_Repo pcr;
	
	public void AddProduct(Product_category p_c)
	{
		pcr.save(p_c);
	}
	
	
	//get all products
		@Autowired
		public List<Product_category> getAllProducts(){
			List<Product_category> list=(List<Product_category>)this.pcr.findAll();
			return list;
		}
		
		
	
		
		
		//############   add product
		@Autowired
		public Product_category addProduct(Product_category p) {
			Product_category result = pcr.save(p);
					return result;
		}
		
		
		//deleteProducts
		@Autowired
		public void deleteProduct(String product) {
			pcr.deleteById(product);;
		}
		
//		
//		//Update the Product
//		@Autowired
//		public void UpdateProduct(Product_category pc, int Productid) {
//			pc.setP_id(Productid);
//			pcr.save(pc);
//		}
//		
//	
//	
}
