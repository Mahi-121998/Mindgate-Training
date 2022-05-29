package com.sky.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sky.domain.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
	
	private static List<Product> products =new ArrayList<Product>();
	@Override
	public void addProduct(Product product) {
		System.out.println("in reposiroty");
		products.add(product);
	}

	@Override
	public List<Product> getProduct() {
		return products;
	}

	@Override
	public Product getProductById(String id) {
		for(Product product:products) {
			if(product.getProductId().equals(id)) {
				return product;
			}
			
		}
		return null;
	}

	@Override
	public boolean deleteById(String id) {
		int index=0;
		for(Product product:products)
		{
			if(product.getProductId().equals(id)) {
				 products.remove(index);
				return true;
			}
			
		}index=index+1;
	return true;
	}

	@Override
	public void updateById(Product product1) {
		int index=0;
		for(Product product:products)
		{
			if(product.getProductId().equals(product1.getProductId())) {
				 products.set(index, product1);
	
			}
			index=index+1;	
		}

		
	}
	
	
 
	
		
	

}
