package com.feliphecosta.sistemarpgmongodb.user.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.feliphecosta.sistemarpgmongodb.user.domain.User;

public class UserNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotEmpty(message="This field is required")
	@Email(message="please enter a valid email")
	private String email;
	
	@NotEmpty(message="This field is required")
	private String password;
	
	public UserNewDTO() {}

	public UserNewDTO(User user) {
		this.email = user.getEmail();
		this.password = user.getPassword();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}