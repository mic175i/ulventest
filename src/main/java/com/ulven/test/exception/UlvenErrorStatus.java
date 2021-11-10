package com.ulven.test.exception;

public enum UlvenErrorStatus {
	INVALID_INPUT_COMMAND("invalid input command", "Invalid input command"),
	NOT_IMPLEMENTED("Not Implemented Exception", "No Implementation found");

	private String msg;
	private String description;

	private UlvenErrorStatus(String msg, String desc) {
		this.msg = msg;
		this.description = desc;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
