package controller.action;//luôn luôn nằm trong packed tên action

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.*;

@Namespace("/demo")
public class DemoAction extends ActionSupport {

	private int a ;//khai báo giá trị cần truyền 
	private String username;
	
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
	
	// htttp://abc.com/demo/index/param1/param2.html
	@Action(value = "index", results = {@Result(name="success" ,location ="/demo/index.jsp")})
	public String index() {
		return "success";
	}
	// htttp://abc.com/demo/demo2.html
	@Action(value="demo2",results={	@Result(name =SUCCESS,location="/demo/demo2.jsp")
			//nếu kết quả trả về của hàm không trùng vời Result sẽ ko load location
	})
	public String demo2(){
		this.a = 123;//truyền tham số
		this.username = "abc";
		return SUCCESS;//hằng số có sẵn
	}
}
