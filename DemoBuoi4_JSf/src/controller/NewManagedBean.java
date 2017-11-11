package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="newManagedBean")
@SessionScoped
public class NewManagedBean {

	public String index() {
		return "/new/index?faces-redirect=true";
	}
	
}
