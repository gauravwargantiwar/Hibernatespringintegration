package com.spring.springproject5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		
		Customer c = (Customer) ac.getBean("pid5");
		System.out.println(c);

	}*/

}



class Customer{
    private String name;
    private String designation;
    private float salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
	public Customer(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
		System.out.println("1st constructor");
	}
	public Customer(String designation, float salary) {
		super();
		this.designation = designation;
		this.salary = salary;
		System.out.println("2nd constructor");
	}
	public Customer( float salary,String name) {
		super();
	
		this.salary = salary;
		this.name = name;
		System.out.println("3 rd constructor");
	}

    
    
    
	
}