package controller;

import java.util.List;

import javax.faces.bean.*;

import entities.Product;
import model.ProductModel;

@ManagedBean(name="demoManagedBean")
@SessionScoped
public class DemoManagedBean {

	private int a ;
	private String username;
	private Product product;
	private List<Product> products;
	
	
	
	
	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public String index() {
		this.a = 123;
		this.username  = "Thật không thể tin được ";
		ProductModel model = new ProductModel();
		this.product= model.find();
		
		this.products = model.findAll();
		
		return "result?faces-redirect=true";
	}
	
	public String detail(Product product) {
		this.product = product;
		return "detail?faces-redirect=true";
	}
	
}
