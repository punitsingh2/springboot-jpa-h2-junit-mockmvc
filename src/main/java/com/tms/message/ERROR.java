package com.tms.message;

public enum ERROR {
	
	USER_NOT_FOUND(404, "User not found for user Id : {0}"),
	USER_NAME_INCORRECT(400,"User name is not valid : {0}");
	
	private final int code;
	private final String errorMessage;
	
	ERROR(final int pCode, final String message){
		this.code = pCode;
		this.errorMessage =message;
	}

	public int getCode() {
		return code;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	
	

}
