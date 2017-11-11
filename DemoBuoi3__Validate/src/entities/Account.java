package entities;

import com.opensymphony.xwork2.validator.annotations.*;

public class Account {
	private String username;
	private String password;
	private int age;
	private String email;
	private String website;
	
	
	@UrlValidator(key = "errors.url")
	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@RequiredStringValidator(key = "errors.required", trim = true)
	@EmailValidator(key = "errors.email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@IntRangeFieldValidator(key = "errors.range" ,min="18" ,max="60")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@RequiredStringValidator(key = "errors.required", trim = true)
	@RegexFieldValidator(key ="errors.password" ,trim = true ,regexExpression="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@RequiredStringValidator(key = "errors.required", trim = true)
	@StringLengthFieldValidator(key = "errors.rangestring", trim = true, minLength = "3", maxLength = "10")
	public String getUsername() {

		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
