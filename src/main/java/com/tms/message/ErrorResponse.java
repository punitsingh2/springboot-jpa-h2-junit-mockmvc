package com.tms.message;

public class ErrorResponse {
	
	private int code;
	private String message;
	private String requestedURI;
	
	public ErrorResponse(int code, String message, String requestedURI) {
		this.code = code;
		this.message = message;
		this.requestedURI = requestedURI;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestedURI() {
		return requestedURI;
	}

	public void setRequestedURI(String requestedURI) {
		this.requestedURI = requestedURI;
	}
	
	

}
