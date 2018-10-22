package com.infogain.api.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CouponListEmpty extends RuntimeException {
	
	public CouponListEmpty(String exception)

	{
		super(exception+" is empty");
	}
}
