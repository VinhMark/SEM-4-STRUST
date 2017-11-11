package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entities.Employee;

@ManagedBean(name="employeeMangedBean")
@SessionScoped
public class EmployeeMangedBean {

	private Employee employee;

	
	
	public EmployeeMangedBean() {
		this.employee = new Employee();
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String save() {
		return "result?faces-redirect=true";
	}
	
}
