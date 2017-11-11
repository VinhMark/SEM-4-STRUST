package model;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ProductModel {

	private List<Product> products;
	public ProductModel(){
		products = new ArrayList<Product>();
		this.products.add(new Product("pr01","product 1" ,"product_img-1.jpg",12));
		this.products.add(new Product("pr02","product 2" ,"product_img-2.jpg",46));
		this.products.add(new Product("pr03","product 3" ,"product_img-3.jpg",19));
		this.products.add(new Product("pr04","product 4" ,"product_img-5.jpg",20));
		this.products.add(new Product("pr05","product 5" ,"product_img-4.jpg",22));
	}
	
	public Product find(String id){
		for (Product product : products) {
			if(product.getId().equalsIgnoreCase(id)){
				return product;
			}
		}
		return null;
	}
}
