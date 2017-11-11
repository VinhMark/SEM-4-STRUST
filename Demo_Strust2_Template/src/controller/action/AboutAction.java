package controller.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.tracing.dtrace.NameAttributes;

@Namespace("/about")
public class AboutAction extends ActionSupport{

	@Action(value="index" ,results={
			@Result(name=SUCCESS ,location="about.index",
					type="tiles")
	})
	public String index() {
		return SUCCESS;
	}
	
}
