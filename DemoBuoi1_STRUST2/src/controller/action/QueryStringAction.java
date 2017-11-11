package controller.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/querystring")
public class QueryStringAction extends ActionSupport{
	private int id;
	private String username;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Action(value="index" ,results ={
			@Result(name=SUCCESS ,location="/querystring/index.jsp")
	})
	public String index(){
		System.out.println("Id :" + this.id);
		System.out.println("Username :" + this.username);
		return SUCCESS;
	}
}