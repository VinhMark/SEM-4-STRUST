package controller.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.validation.SkipValidation;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;

import entities.Account;

@Namespace("/account")
public class AccountAction extends ActionSupport {

	private Account account;

	@VisitorFieldValidator
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Action(value = "index", results = { @Result(name = SUCCESS, location = "/account/index.jsp") })
	@SkipValidation
	public String index() {
		this.account = new Account();
		return SUCCESS;
	}

	@Action(value = "index2", results = { @Result(name = SUCCESS, location = "/account/index2.jsp") })
	@SkipValidation
	public String index2() {
		this.account = new Account();
		return SUCCESS;
	}

	
	@Action(value = "save", results = { @Result(name = SUCCESS, location = "/account/save.jsp"),
			@Result(name = INPUT, location = "/account/index.jsp") })
	public String save() {
		return SUCCESS;
	}

	@Override
	public void validate() {
		if(this.account.getUsername().equalsIgnoreCase("abc")){
			addFieldError("account.username", getText("errors.existing"));
		}
	}
	
	

}
