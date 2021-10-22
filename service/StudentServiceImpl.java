package com.collegeManagement.CollegeDatabase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collegeManagement.CollegeDatabase.entity.Student;
import com.collegeManagement.CollegeDatabase.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{

  private final StudentRepo studentRepo;

  @Autowired
  public StudentServiceImpl(StudentRepo studentRepo) {
    this.studentRepo = studentRepo;
  }

  @Override
  public Student insertStudent(Student student) {
   return studentRepo.save(student);
  }

  @Override
  public Student getStudentById(int id) {
    //return studentRepo.getStudentById(id);
    return studentRepo.findById(id).get();
  }

  @Override
  public List<Student> getStudents() {
    return studentRepo.findAll();
  }
  @Override
  public void deleteStudentById(int id) {
	   studentRepo.deleteById(id);
  }

@Override
public Student updateStudent(Student student) {
	return studentRepo.save(student);
}
	
	@Override
	public void deleteStudentBynoOfStudent(int no_of_student){
		studentRepo.deleteBynoOfStudent(no_of_student);
	
	}
}
  


