package com.collegeManagement.CollegeDatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.collegeManagement.CollegeDatabase.entity.Student;
import com.collegeManagement.CollegeDatabase.service.StudentService;
@RestController
public class StudentController {
	private final StudentService studentService;

	  @Autowired
	  public StudentController(StudentService studentService) {
	    this.studentService = studentService;
	  }

	  @PostMapping("student2")
	  Student insert(@RequestBody Student student){
	    return studentService.insertStudent(student);
	  }

	  @GetMapping("student2")
	  List<Student> getEmployee(){
	    return studentService.getStudents();
	  }

	  @GetMapping("student2/{id}")
	  Student getById(@PathVariable int id){
	    return studentService.getStudentById(id);
	  }
	 
	  @DeleteMapping("student2/{id}")
	  void deleteById(@PathVariable int id) {
		  studentService.deleteStudentById(id);
	  }
	 @PutMapping("student2/update")
	  Student updateStudentById(@RequestBody  Student student) {
		return studentService.updateStudent(student);
	  }
	 @DeleteMapping("student2/ByNo/{no_of_student}")
	 void deleteBynoOfStudent(@PathVariable int no_of_student) {
	 studentService.deleteStudentBynoOfStudent(no_of_student);	 
	}
	
	  }
	



