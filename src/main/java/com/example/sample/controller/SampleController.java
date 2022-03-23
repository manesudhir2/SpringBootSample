package com.example.sample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.pojo.Student;

@RestController
public class SampleController {

	
	@GetMapping("/sample")
	public String sampleMethod() {
		return "working";
	}
	
	@GetMapping("/getStudent")
	public Student getStudent() {
		return new Student("Sudhir","Mane");
	}
	
	@GetMapping("/listStudents")
	public List<Student> getAllStudents(){
		
		List<Student> studentlist = new ArrayList();
		
		Student s1 = new Student("Sudhir","Mane");
		Student s2 = new Student("Hrushi","Khirsagar");
		Student s3 = new Student("Essy","Thoppil");
		Student s4 = new Student("Yash","Kharote");
		Student s5 = new Student("Rahul","Metry");
		
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		studentlist.add(s4);
		studentlist.add(s5);
		
		return studentlist;
	}
}
