package controller.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Namespace("/home")
public class HomeAction extends ActionSupport{

	@Action(value="index" ,results={
			@Result(name=SUCCESS ,location="home.index"
					,type ="tiles")//khai báo sử dụng thư viện titles
	})
	public String index() {
		return SUCCESS;
	}
	
}
