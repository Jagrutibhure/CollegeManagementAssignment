package com.collegeManagement.CollegeDatabase.service;

import java.util.List;

import com.collegeManagement.CollegeDatabase.entity.Student;


public interface StudentService {

	  Student insertStudent(Student student);
	  Student getStudentById(int id);
	  List<Student> getStudents();
	 void deleteStudentById(int id);
	Student updateStudent(Student student);
	void deleteStudentBynoOfStudent(int no_of_student);
	
	}
