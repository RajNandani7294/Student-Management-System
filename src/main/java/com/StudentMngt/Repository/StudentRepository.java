package com.StudentMngt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentMngt.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
