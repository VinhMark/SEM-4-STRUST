package controller.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import java.util.*;
import entities.*;
import model.ProductModel;
@Namespace("/product")
public class ProductAction extends ActionSupport{
	private String id;
	private Product product;
	private List<Product> products;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
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


	@Action(value="index" ,results ={
		@Result(name=SUCCESS , location="/product/index.jsp")
	})
	public String index(){
		this.product = new Product("pr01","product 1" ,"product_img-1.jpg",2);
		return SUCCESS;
	}
	
	@Action(value="list" ,results={@Result(name=SUCCESS, location="/product/list.jsp")})
	public String list(){
		this.products = new ArrayList<Product>();
		this.products.add(new Product("pr01","product 1" ,"product_img-1.jpg",12));
		this.products.add(new Product("pr02","product 2" ,"product_img-2.jpg",46));
		this.products.add(new Product("pr03","product 3" ,"product_img-3.jpg",19));
		this.products.add(new Product("pr04","product 4" ,"product_img-5.jpg",20));
		this.products.add(new Product("pr05","product 5" ,"product_img-4.jpg",22));
		return SUCCESS;
	}
	
	@Action(value="detail" ,results={@Result(name=SUCCESS, location="/product/index.jsp")})
	public String detail(){
	
		ProductModel productModel = new ProductModel();
		this.product = productModel.find(id);
		
		return SUCCESS;
	}
}
