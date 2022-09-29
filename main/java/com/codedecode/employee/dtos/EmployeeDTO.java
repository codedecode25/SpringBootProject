package com.codedecode.employee.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeDTO {
	
	private int id;
	
	@NotBlank(message="Name cannot be blank for an employee")
	private String name;
	
	@Min(20)
	@Max(100)
	private int age;
	
	@Email
	@NotBlank(message="Email cant be null")
	private String emailAddress;
	
	//@NotBlank(message="Project cant be null")
	private int projectId;
	

}
