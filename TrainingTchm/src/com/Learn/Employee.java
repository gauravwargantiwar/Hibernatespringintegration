package com.Learn;

import java.io.Serializable;

public class Employee implements Serializable {
 private int empId;
 private String empsalary;
 private String empName;
public Employee(int empId, String empsalary, String empName) {
	super();
	this.empId = empId;
	this.empsalary = empsalary;
	this.empName = empName;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empsalary=" + empsalary + ", empName=" + empName + "]";
}
 
 
}
