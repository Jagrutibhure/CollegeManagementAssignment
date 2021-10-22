package com.collegeManagement.CollegeDatabase.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.collegeManagement.CollegeDatabase.entity.Student;


public interface StudentRepo extends JpaRepository<Student,Integer> {
	@Transactional
	@Modifying
@Query(value="delete from public.student2 where student2.no_of_student= ?1",nativeQuery=true)
	void deleteBynoOfStudent(int no_of_student);

	

}
