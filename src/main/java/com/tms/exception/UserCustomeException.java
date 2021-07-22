package com.tms.exception;

public class UserCustomeException extends RuntimeException{
	
	/**
	 * serializable version id
	 */
	private static final long serialVersionUID = 1L;
	private int errorCode;
	
	public UserCustomeException() {
		super();
	}

	public UserCustomeException(final String pMessage) {
		super(pMessage);
	}
	
	public UserCustomeException(final int PErrorCode, final String pMessage) {
		super(pMessage);
		this.errorCode = PErrorCode;
	}
	
	public UserCustomeException(final int PErrorCode, final String pMessage, final Throwable throwable) {
		super(pMessage,throwable);
		this.errorCode = PErrorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	
}
