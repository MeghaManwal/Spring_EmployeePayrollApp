package com.bridgelabz.employeepayrollapp.dto;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;

public @Data class EmployeePayrollDTO {
	
	@Pattern(regexp = "^[A-Z]{1}[a-z A-Z\\s]{2,}$", message = "Employee Name Invalid")
	@NotEmpty(message = "Employee name cannot be null")
	public String name;
	
	@Min(value=5000, message="Min Wage should be more than 5000")
	public long salary;
	
	public String gender;
	
	public String startDate;
	
	public String note;
	
	public String profilePic;
	
	public List<String> department;
		
}
