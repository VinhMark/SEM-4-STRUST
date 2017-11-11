package entities;

public class Account {

	private String username;
	private String password;
	private String description;
	private boolean status;
	private String[] language;
	private String[] language1;
	private String gender;
	private String role;
	
	
	
	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gander) {
		this.gender = gander;
	}

	public String[] getLanguage() {
		return language;
	}

	public String[] getLanguage1() {
		return language1;
	}

	public void setLanguage1(String[] language1) {
		this.language1 = language1;
	}

	public void setLanguage(String[] language) {
		this.language = language;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
