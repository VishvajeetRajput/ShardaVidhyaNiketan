package com.sharda.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Login {
	
	@NotBlank(message = "email can't be empty")
	@Email
	String email;
	
	@NotBlank(message = "password can't be empty")
	String password;
}
