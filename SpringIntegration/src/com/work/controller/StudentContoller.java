package com.work.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.work.entity.Student;

@Controller
public class StudentContoller {

	@RequestMapping(value="/addStudent")
	public String displayAddStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student",student);
		return "AddStudent";
		
	}
}
