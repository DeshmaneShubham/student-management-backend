package com.TechnoSignia.StudentManagement.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TechnoSignia.StudentManagement.Entity.Student;
import com.TechnoSignia.StudentManagement.Service.StudentService;

@CrossOrigin(origins = "*")
@RestController
public class StudentController {
	@Autowired 
	private StudentService service;
	
	@PostMapping({"/CreateStudent", "/insertData"})
	public Student inserData(@RequestBody Student student) {
		return service.insertData(student);
	}
	
	@GetMapping({"/AllStudents", "/allStudents"})
	public List<Student> allStudent(){
		return service.getallStudent();
	}

	@GetMapping("/student/{id}")
	public Optional<Student> getSingleStudent(@PathVariable Long id){
		return service.getbyid(id);
	}
	
	@PutMapping({"/student/{id}", "/update/{id}"})
	public Student updatestudent(@PathVariable Long id, @RequestBody Student std) {
		return service.updatebyid(id, std);
	}
	
	@DeleteMapping({"/student/{id}", "/delete/{id}"})
	public String deleteData(@PathVariable Long id) {
		return service.deleteByid(id);
	}
}
