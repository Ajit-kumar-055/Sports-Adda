package com.pp.SportsAdda.Exceptions;

import lombok.Getter;
import lombok.Setter;

// Unchecked exception

@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException{
	String  resourceName;
	String fieldName;
	long fieldValue;
	
	public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue) {
		super(String.format("%s not found with %s : %s", resourceName,fieldName,fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	

}
