package br.edu.ifrs.canoas.lpoo2.p1;

public class User {
	private long id;
	protected String loginStatus;
	private String email;
	
	public boolean verifyLogin() {
		return (loginStatus != null && loginStatus == "online") ? true : false; 
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
