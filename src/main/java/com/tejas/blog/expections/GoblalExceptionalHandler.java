package com.tejas.blog.expections;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.tejas.blog.payload.ApisResponse;

@ControllerAdvice
public class GoblalExceptionalHandler {
	@ExceptionHandler(ResourceNotFoundExpection.class)
	public ResponseEntity<ApisResponse> resourceNotFoundExpectionHandler (ResourceNotFoundExpection ex){
		String message = ex.getMessage();
		ApisResponse apisResponse = new ApisResponse(message, false);
		return new ResponseEntity<ApisResponse>(apisResponse,HttpStatus.NOT_FOUND);
		}

}
