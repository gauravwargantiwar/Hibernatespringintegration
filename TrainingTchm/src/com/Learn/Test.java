package com.Learn;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter employee details");
		System.out.println("enter emp id");
		
		int empId = sc.nextInt();
		System.out.println("enter emp salary");
		
		String empsalary  = sc.next();
		System.out.println("enter emp name");
		String empName = sc.next();
		Employee emp = new Employee(empId, empsalary, empName);
		System.out.println(emp);
		
		try (ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("d:\\temp\\Store.text"))) {

			oos.writeObject(emp);
			System.out.println("Done");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	
	}
}

