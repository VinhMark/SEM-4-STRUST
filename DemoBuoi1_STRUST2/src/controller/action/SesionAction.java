package controller.action;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Namespace("/session")
public class SesionAction extends ActionSupport{

	@Action(value="index", results={
			@Result(name=SUCCESS , location="/session/index.jsp")
	})
	public String index(){
		Map<String, Object> session = ActionContext.getContext().getSession();//tạo ra một session
		session.put("a",123);//khởi tạo giá trị sessioin
		session.put("username","abc");
		return SUCCESS;
	}
	
}
