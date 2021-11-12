package com.john.myproject;

public class InvalidValueException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidValueException(String msg) {
		super(msg);
	}
}
