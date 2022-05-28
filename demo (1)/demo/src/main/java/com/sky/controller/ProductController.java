package com.sky.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sky.domain.Product;
import com.sky.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController 
{
	@Autowired
	private ProductService productservice;
	
	@RequestMapping(value="/product",method=RequestMethod.GET,consumes = "application/json", produces ="application/json")
	public @ResponseBody List<Product> getProducts()
	{
	return productservice.getProduct();
	
	}
	
	@RequestMapping(value="/product",method=RequestMethod.POST,consumes = "application/json", produces ="application/json")
	public @ResponseBody Product addProduct(@RequestBody Product product) 
	{
	System.out.println(product);
	productservice.addProduct(product);
	return product;
	}
	@RequestMapping(value= "/product/{id}",method=RequestMethod.GET, consumes = "application/json", produces ="application/json" )
	public @ResponseBody Product getProductById(@PathVariable("id") String id) {
		return productservice.getProductById(id);
	}
	
	@RequestMapping(value= "/product/{id}",method=RequestMethod.DELETE, consumes = "application/json", produces ="application/json" )
	public @ResponseBody Product deleteById(@PathVariable("id") String id) {
		return productservice.deleteById(id);
	}
	@RequestMapping(value= "/product",method=RequestMethod.PUT, consumes = "application/json", produces ="application/json" )
	public @ResponseBody Product updateById(@RequestBody Product product1) {
		return productservice.updateById(product1);
	}
}
