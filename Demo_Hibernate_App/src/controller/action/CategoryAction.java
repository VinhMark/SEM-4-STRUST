package controller.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import entities.Category;
import model.CategoryModel;

@Namespace("/category")
public class CategoryAction extends ActionSupport {

	private List<Category> categories;
	private Category category;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	@Action(value = "index", results = { @Result(name = SUCCESS, location = "/category/index.jsp") })
	public String index() {
		CategoryModel categoryModel = new CategoryModel();
		this.categories = categoryModel.findAll();
		return SUCCESS;
	}

	@Action(value = "create", results = { @Result(name = SUCCESS, location = "/category/create.jsp") })
	public String create() {
		CategoryModel categoryModel = new CategoryModel();
		this.category = new Category();
		return SUCCESS;
	}

	//update get
	@Action(value = "update" , results = {@Result(name = SUCCESS , location= "/category/update.jsp")})
	public String update(){
		CategoryModel model = new CategoryModel();
		this.category = model.find(id);
		return SUCCESS;
	}
	
	//update post
	@Action(value = "saveUpdate" , results ={@Result(name = SUCCESS ,type= "redirectAction" ,params = {"namespace" ,"/category" , "actionName","index"})})
	public String saveUpdate(){
		//ở đây nó nhân về đối tượng cần update rồi 
		CategoryModel model = new CategoryModel();
		model.Update(this.category);
		return SUCCESS;
	}
	
	@Action(value = "save", results = { @Result(name = SUCCESS, type = "redirectAction", params = { "namespace",
			"/category", "actionName", "index" })// reiderwxt
	})
	public String save() {
		CategoryModel categoryModel = new CategoryModel();
		categoryModel.Create(this.category);
		return SUCCESS;
	}
	
	///delete
	@Action(value = "delete", results = { @Result(name = SUCCESS, type = "redirectAction", params = { "namespace",
			"/category", "actionName", "index" })// reiderwxt
	})
	public String delete() {
		CategoryModel categoryModel = new CategoryModel();
		categoryModel.Delete(categoryModel.find(id));
		return SUCCESS;
	}
}
