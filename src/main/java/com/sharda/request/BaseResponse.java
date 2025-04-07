package com.sharda.request;

import org.springframework.http.HttpStatus;

/*
 * This class is for API Response.
*/
public class BaseResponse {

	private HttpStatus status;
	private Object description;
	private String code;

	public BaseResponse() {

	}

	public BaseResponse(HttpStatus status, Object description, String code) {
		this.status = status;
		this.description = description;
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public Object getDescription() {
		return description;
	}

	public void setDescription(Object description) {
		this.description = description;
	}

}
