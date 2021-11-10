package com.ulven.test.exception;

public class ValidationException extends RuntimeException {
	private static final long serialVersionUID = 200L;

	public ValidationException() {
		super("Invalid");
	}

	public ValidationException(String message) {
		super(message);
	}
}
