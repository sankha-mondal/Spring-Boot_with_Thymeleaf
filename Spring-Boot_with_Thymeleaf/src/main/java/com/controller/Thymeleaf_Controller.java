package com.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Student;

@Controller
public class Thymeleaf_Controller {

	// http://localhost:8585/hello

	@RequestMapping("/hello")
	public String hello() {
		return "hello"; // invoke the hello.html page
	}

	// Sending Text data to View:
	// http://localhost:8585/sendData

	@RequestMapping("/sendData")
	public ModelAndView send_Data() {
		ModelAndView mav = new ModelAndView("data"); // invoke the data.html page
		mav.addObject("message", "Take up one idea and make it your life");
		System.out.println(mav);
		return mav;
	}

	// Sending Object data to View:
	// http://localhost:8585/student

	@RequestMapping("/student")
	public ModelAndView get_Student() {
		ModelAndView mav = new ModelAndView("student"); // invoke the student.html page
		Student student = new Student();
		// mav.addObject("student", new Student());
		student.setName("John");
		student.setScore(98);
		mav.addObject("student", student);
		return mav;
	}

	// Rendering multiple Data:
	// http://localhost:8585/studentList

	@RequestMapping("/studentList")
	public ModelAndView get_StudentList() {
		ModelAndView mav = new ModelAndView("studentList"); // invoke the studentList.html page

		Student student1 = new Student();
		student1.setName("John");
		student1.setScore(98);

		Student student2 = new Student();
		student2.setName("Bob");
		student2.setScore(85);

		List<Student> students = Arrays.asList(student1, student2);

		mav.addObject("students", students);
		return mav;
	}

	// Creating a HTML Form:
	// http://localhost:8585/studentForm

	@RequestMapping("/studentForm")
	public ModelAndView display_StudentForm() {
		ModelAndView mav = new ModelAndView("studentForm"); // invoke the studentForm.html page
		Student student = new Student();
		// adding default value
		// student.setName("Bob");
		// student.setScore(80);
		mav.addObject("student", student);
		return mav;
	}

	// Save data from HTML Form:
	// http://localhost:8585/studentForm

	@RequestMapping("/save_Student")
	public ModelAndView save_Student(@ModelAttribute Student student) {
		ModelAndView mav = new ModelAndView("result"); // invoke the result.html page
		System.out.println(student.getName());
		System.out.println(student.getScore());
		System.out.println(mav);
		return mav;
	}

}
