package com.etiya.rentACar.core.crossCuttingConcers.exceptionHandling;

@SuppressWarnings("serial")
public class BusinessException extends RuntimeException {
	public BusinessException(String message) {
		super(message);
	}
}
