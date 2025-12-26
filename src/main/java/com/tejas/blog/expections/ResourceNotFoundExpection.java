package com.tejas.blog.expections;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceNotFoundExpection extends RuntimeException{
	String resourceName;
	String fieldName;
	long fieldValue;
	public ResourceNotFoundExpection(String resourceName, String fieldName, long fieldValue) {
		super(String.format("%s not found with %s : %s",  resourceName,fieldName,fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	
}
