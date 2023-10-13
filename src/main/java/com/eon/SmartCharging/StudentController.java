package com.eon.SmartCharging;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/")
	public Student getStudent() {
		return new Student("Vinod","Reddy");
	}

	@GetMapping("/aaaa")
    public Student getStudent1()
    {
    	return new Student("aaa" ,"bbb");
    }
    
	
@GetMapping("/c")
public Student getStudent2() {
	return new Student("bbb","bbb");
}

@GetMapping("/students")
public List<Student> getStudents(){
	List<Student> students=new ArrayList<>();
	students.add(new Student("vvv","bbb"));
	students.add(new Student("vvv","bbb"));
	students.add(new Student("vvv","bbb"));
	return students;
}
}

