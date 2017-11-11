package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="calculateManagedBean")
@SessionScoped
public class CalculateManagedBean {

	private double number1;
	private double number2;
	private double result;
	private String operator;
	public double getNumber1() {
		return number1;
	}
	public void setNumber1(double number1) {
		this.number1 = number1;
	}
	public double getNumber2() {
		return number2;
	}
	public void setNumber2(double number2) {
		this.number2 = number2;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	public void calculate() {
		String operator = this.operator;
		if (operator.equalsIgnoreCase("+")) {
			this.result = this.number1 + this.number2;
		}else if (operator.equalsIgnoreCase("-")) {
			this.result = this.number1 - this.number2;
		}else if (operator.equalsIgnoreCase("*")) {
			this.result = this.number1 * this.number2;
		}else if (operator.equalsIgnoreCase("/")) {
			this.result = this.number1 / this.number2;
		}
	}
}
