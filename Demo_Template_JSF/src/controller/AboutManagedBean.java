package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="aboutManagedBean")
@SessionScoped
public class AboutManagedBean {
	
	public String about() {
		return "/about/index.xhtml?faces-redirect=true";
	}
	
}
