package com.sky.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.sky.domain.Product;

@Repository("ProductRepositoryDBImpl")
public class ProductRepositoryDBImpl implements ProductRepository {
	
	private static String INSERT_PRODUCT_SQL="insert into product(PRODUCT_ID,PRODUCT_NAME,PRODUCT_PRICE) values(?,?,?)";
	
	private static String ALL_PRODUCT_SQL="select PRODUCT_ID,PRODUCT_NAME,PRODUCT_PRICE from product";
	
	private static String GET_PRODUCT_BY_ID="select PRODUCT_ID,PRODUCT_NAME,PRODUCT_PRICE from product where PRODUCT_ID=?";
	private static String DELETE_PRODUCT_BY_ID="DELETE from product where PRODUCT_ID=?";
	private static String UPDATE_PRODUCT_BY_ID="update product set(PRODUCT_NAME,PRODUCT_PRICE) where PRODUCT_ID=?"; 

	
	@Autowired
	private JdbcTemplate jdbctemplate;
	@Override
	public void addProduct(Product product) {
		jdbctemplate.update(INSERT_PRODUCT_SQL,product.getProductId(),product.getProductName(),product.getPrice());		
	}

	@Override
	public List<Product> getProduct() {
		return this.jdbctemplate.query(ALL_PRODUCT_SQL, new ProductRowMapper());
		
	}

	@Override
	public Product getProductById(String  productId) {
		 return this.jdbctemplate.queryForObject
				  ( GET_PRODUCT_BY_ID,
				    new Object[]{productId}, new ProductRowMapper());
	
	}

	@Override
	public boolean deleteById(String productId) {
		this.jdbctemplate.update(DELETE_PRODUCT_BY_ID, productId);

		return true;
	   
	}

	@Override
	public Product updateById(Product ) {
		return null;
	}
	private static final class ProductRowMapper implements RowMapper<Product>{
		public Product mapRow(ResultSet rs, int rownum) throws SQLException{
			Product product=new Product();
			product.setProductId(rs.getString("product_Id"));
			product.setProductName(rs.getString("product_Name"));
			product.setPrice(rs.getInt("product_price"));
			return product;
		}
	}

}
