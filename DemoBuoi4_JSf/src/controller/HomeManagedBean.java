package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="homeManagedBean")
@SessionScoped
public class HomeManagedBean {
	
	public String index() {
		return "/home/index?faces-redirect=true";
	}
	
}
