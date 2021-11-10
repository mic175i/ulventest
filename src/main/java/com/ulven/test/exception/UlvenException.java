package com.ulven.test.exception;

public class UlvenException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private final UlvenErrorStatus error;

	public UlvenException(UlvenErrorStatus error) {
		super(new StringBuilder(error.getMsg()).append(" ")
			.append(error.getDescription()).toString());
		this.error = error;
	}

	public UlvenErrorStatus getError() {
		return error;
	}
}
