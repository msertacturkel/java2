package org.csystem.beans;

public class UserBean {

	private String user, password;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String userControl() {
		if (user.equals("ahmet") && (password.equals("123")))
			return "basarili";
		user=null;
		
		return "basarisiz";
	}
}
