package controller;


import java.text.SimpleDateFormat;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import entities.Account;
import entities.Language;
import model.LanguageModel;

@ManagedBean(name = "accountManagedBean")
@SessionScoped
public class AccountManagedBean {

	private Account account;
	private List<Language> languages;
	private Language language;
	private String message;
	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public AccountManagedBean() {
		LanguageModel languageModel = new LanguageModel();
		this.languages = languageModel.findAll();
		this.language= new Language();
		this.account = new Account();
		this.account.setGender("m");
		this.account.setStatus(true);
		this.account.setLanguage(new String[] {"l1","l2","l4"});
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String save() {
		System.out.println("Username is :" + this.account.getUsername());
		for (String language : this.account.getLanguage()) {
			System.out.println(language);
		}
		HttpServletRequest request = null ;
		HttpSession session = request.getSession();
		session.setAttribute("username", this.account.getUsername());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(simpleDateFormat.format(this.account.getBirthday()));
		System.out.println(this.account.getDetail());
		return "success?faces-redirect=true";
	}
	public String login() {
		if(this.account.getUsername().equalsIgnoreCase("admin") && this.account.getPassword().equalsIgnoreCase("123456")){
			return "calculate?faces-redirect=true";
		}else{
			this.message = "dang nhap that bai";
			return "login?faces-redirect=true";
		}
	}

}
