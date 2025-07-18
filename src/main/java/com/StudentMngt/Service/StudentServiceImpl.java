package com.StudentMngt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentMngt.Entity.Student;
import com.StudentMngt.Repository.StudentRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	 private StudentRepository sudentRepository;

	@Override
	public Student createData(Student student) {
		return sudentRepository.save(student);
	}

	@Override
	public List<Student> getAll() {
		return sudentRepository.findAll();
	}

	@Override
	public Student getbyid(int id) {
	return  sudentRepository.findById(id)
			.orElseThrow(()->new EntityNotFoundException("User not found with ID:" +id));
	}
     
	@Override
	public String update(int id, Student student) {
		Student std = getbyid(id);
		std.setName(student.getName());
		std.setEmailid(student.getEmailid());
		std.setAddress(student.getAddress());
		std.setPhoneNo(student.getPhoneNo());
		 sudentRepository.save(std);
		 return "Successfully update studentRecode";
	}

	@Override
	public String delete(int id) {
		sudentRepository.deleteById(id);
		return "Successfuliiy delete";
	}

}
