package model;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import sun.net.www.content.text.plain;

public class ProductModel {
	
	public Product find() {
		Product product = new Product("p01","name 01",54,"15" , "img1.png");
		return product;
	}
	
	public List<Product> findAll() {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("p01","name 01",54,"15" , "img1.png"));
		products.add(new Product("p02","name 02",54,"55" , "img2.png"));
		products.add(new Product("p03","name 03",54,"5" , "img3.png"));
		products.add(new Product("p04","name 04",54,"5" , "img4.png"));
		products.add(new Product("p05","name 05",54,"11" , "img3.png"));
		products.add(new Product("p06","name 06",54,"2" , "img2.png"));
		return products;
	}
}
