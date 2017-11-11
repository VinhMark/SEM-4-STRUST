package controller.action;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entities.Account;
import entities.Language;
import entities.Role;
import model.LanguageModel;
import model.RoleModel;

@Namespace("/account")
public class AccountAction extends ActionSupport {

	private Account account;
	private List<Language> languages;
	private List<Role> roles;
	private String errorMessage = "";

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Action(value = "index", results = { @Result(name = SUCCESS, location = "/account/index.jsp") })
	public String index() {
		LanguageModel languageModel = new LanguageModel();
		RoleModel roleModel = new RoleModel();
		this.roles = roleModel.findAll();
		this.languages = languageModel.findAll();
		this.account = new Account();
		// gán sẵn một cái username
		this.account.setUsername("abc");
		this.account.setStatus(true);
		this.account.setLanguage1(new String[] { "l1, l3" });
		this.account.setGender("Male");

		return SUCCESS;
	}

	@Action(value = "save", results = { @Result(name = SUCCESS, location = "/account/result.jsp") })
	public String save() {
		System.out.println("Username : " + this.account.getUsername());
		System.out.println("pass : " + this.account.getPassword());
		System.out.println("description : " + this.account.getDescription());
		System.out.println("Status : " + this.account.isStatus());
		System.out.println("Language : ");
		for (String la : this.account.getLanguage()) {
			System.err.print("" + la);
		}
		System.out.println();
		System.out.print("Language 1: ");
		for (String la : this.account.getLanguage1()) {
			System.err.print("" + la);
		}
		System.out.println();
		System.err.println("Gender" + this.account.getGender());
		System.out.println("Roles" + this.account.getRole());
		return SUCCESS;
	}

	@Action(value = "login", results = { @Result(name = SUCCESS, location = "/account/login.jsp") })
	public String login() {
		this.account = new Account();
		account.setUsername("Nhap dai di ban ");
		account.setPassword("thatkhongthetinduoc");
		return SUCCESS;
	}

	@Action(value = "process_login", results = { @Result(name = SUCCESS, location = "/account/welcome.jsp"),
			@Result(name = ERROR, location = "/account/login.jsp") })
	public String process_login() {
		if (this.account.getUsername().equalsIgnoreCase("abc") && this.account.getPassword().equalsIgnoreCase("123")) {
			Map<String, Object> session = ActionContext.getContext().getSession();
			session.put("username", account.getUsername());
			return SUCCESS;
		}
		this.errorMessage = "Invalid";
		return ERROR;
	}

	@Action(value = "logout", results = { @Result(name = SUCCESS, type = "redirectAction", params = { "namespace",
			"/account", "actionName", "login" }) })
	public String logout() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.remove("username");//hủy session username
		return SUCCESS;
	}
}
