/**
 * 
 */
package com.tracker.domain;

import java.io.Serializable;

/**
 * @author premvarathen
 *
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	private String name;
	
	private String password;
	
	private Boolean isAdmin;

	public String getName() {
		return name;
	}

	public User(String name, String password, Boolean isAdmin) {
		super();
		this.name = name;
		this.password = password;
		this.isAdmin = isAdmin;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
