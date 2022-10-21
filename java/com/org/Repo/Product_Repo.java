package com.org.Repo;

import org.springframework.data.repository.CrudRepository;

import com.org.Entity.Product;

public interface Product_Repo extends CrudRepository<Product, Integer> {

}
