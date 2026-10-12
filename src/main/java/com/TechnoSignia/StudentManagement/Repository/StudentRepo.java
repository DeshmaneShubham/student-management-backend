package com.TechnoSignia.StudentManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.TechnoSignia.StudentManagement.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
}
