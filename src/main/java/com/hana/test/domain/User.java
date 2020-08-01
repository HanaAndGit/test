package com.hana.test.domain;

public class User {
	private int userno;
	private String username;
	private String userid;
	private String userpw;
	
	
	public User() {
		super();
	}

	public User(int userno, String username, String userid, String userpw) {
		super();
		this.userno = userno;
		this.username = username;
		this.userid = userid;
		this.userpw = userpw;
	}

	public int getUserno() {
		return userno;
	}

	public void setUserno(int userno) {
		this.userno = userno;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserpw() {
		return userpw;
	}

	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}

	@Override
	public String toString() {
		return "User [userno=" + userno + ", username=" + username + ", userid=" + userid + ", userpw=" + userpw + "]";
	}
	
	
	
}
