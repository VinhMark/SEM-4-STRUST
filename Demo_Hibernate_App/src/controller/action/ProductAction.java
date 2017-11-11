package controller.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import entities.Product;
import model.ProductModel;

@Namespace("/product")
public class ProductAction extends ActionSupport {

	private int id;
	private Product product;
	private List<Product> products;
	private String err;
	

	public String getErr() {
		return err;
	}

	public void setErr(String err) {
		this.err = err;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Action(value = "index" , results = {@Result(name = SUCCESS , location = "/product/index.jsp")})
	public String index() {
		ProductModel model = new ProductModel();
		this.products = model.findAll();
		return SUCCESS;
	}

	@Action(value = "updateGET" , results = {@Result(name=SUCCESS , location= "/product/update.jsp")})
	public String updateGET(){
		ProductModel model = new ProductModel();
		this.product = model.find(id);
		return SUCCESS;
	}
	
	@Action(value= "updatePOST" , results = {@Result(name =SUCCESS,type ="redirectAction" , params={"namespace" , "/product" , "actionName","index"}) ,
			@Result(name=ERROR , type = "redirectAction" , params = {"namespace","/product","actionName","updatePOST"})})
	public String updatePOST() {
		ProductModel model = new ProductModel();
		
		if (model.update(this.product)) {
			return SUCCESS;
		}else
			this.err = "Cap nhap that bai roi ban oi !";
			return ERROR;
	}
	
	@Action(value="delete" ,results={@Result(name=SUCCESS,type="redirectAction", params={"namespace" , "/product" , "actionName" ,"index"}),
			@Result(name=ERROR , type = "redirectAction" , params={"namespace","/product" , "actionName" ,"index"})})
	public String delete() {
		ProductModel model = new ProductModel();
		if (model.delete(id)) {
			return SUCCESS;
		}
		return ERROR;
	}

}
