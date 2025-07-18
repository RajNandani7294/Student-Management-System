package com.StudentMngt.Service;

import java.util.List;

import com.StudentMngt.Entity.Student;

public interface StudentService {
	
	public Student createData(Student student);
	
	public List<Student> getAll();
	
	public Student getbyid(int id);
	
	public String delete(int id);

	public String update(int id, Student student);

}
