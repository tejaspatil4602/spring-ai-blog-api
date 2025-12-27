package com.tejas.blog.expections;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
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

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handleMethodArgsValidException (MethodArgumentNotValidException ex){
		Map<String, String> resp = new HashMap<String, String>();
		ex.getBindingResult().getAllErrors().forEach((error)->{
			String fieldNameString =((FieldError)error).getField();
			String message = error.getDefaultMessage();
			resp.put(fieldNameString, message);
			
		});
		return new ResponseEntity<Map<String,String>>(resp,HttpStatus.BAD_REQUEST);
		
	}
}
	


