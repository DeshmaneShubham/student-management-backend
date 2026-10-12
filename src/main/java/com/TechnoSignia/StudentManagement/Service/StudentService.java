package com.TechnoSignia.StudentManagement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.TechnoSignia.StudentManagement.Entity.Student;
import com.TechnoSignia.StudentManagement.Repository.StudentRepo;


@Service
public class StudentService {
	@Autowired
	private StudentRepo repo;
	
	//Insert Student data
		public Student insertData(Student student) {
			return repo.save(student);
		}
		
		//Cheak all data
		public List<Student> getallStudent(){
			return repo.findAll();
		}
		
		//Cheak only one data
		public Optional<Student> getbyid(Long id){
			return repo.findById(id);
		}
		
		//update data by id
		public Student updatebyid(Long id,Student std){
			std.setId(id);
			return repo.save(std);
		}
		
		//Delete by id
		public String deleteByid(Long id) {
			 repo.deleteById(id);
			 return "Deleted succesfuly......";
			 
		}

	
		
}
