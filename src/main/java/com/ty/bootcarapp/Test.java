package com.ty.bootcarapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	
	@GetMapping("/eat")
	public String eat() {
		return "i eat pizza";
	}
	
	@GetMapping("/dring")
	public String drink() {
		return "i drink pepsi";
	}
	
	@GetMapping("/student")
	public Student getStudent() {
		Student student  = new Student();
		student.setId(101);
		student.setName("sufiyan");
		student.setPercentage(74.68);
		return student;
	}
	
	@GetMapping("/student1/{id}")
	public String getStudentId(@PathVariable int id) {
		return "id is "+id;
	}
	
	@GetMapping("/aunty")
	public String getAuntyId(@RequestParam int id) {
		return "aunty id is "+id;
	}
	
	@PostMapping("/sav")
	public String recive(@RequestBody Student student) {
		return "hi "+student.getName();
	}
	
	@GetMapping("/all")
	public List<Student> getAll(){
		List<Student> students = new ArrayList<Student>();
		
		Student student = new Student();
		student.setId(1);
		student.setName("Nayana");
		student.setPercentage(90.13);
		Student student2 = new Student();
		student2.setId(1);
		student2.setName("Nitya");
		student2.setPercentage(80.13);
		Student student3 = new Student();
		student3.setId(1);
		student3.setName("Narayan");
		student3.setPercentage(99.13);
		
		students.add(student);
		students.add(student);
		students.add(student3);
		
		return students;
	}
	
	
	
	
	
}
