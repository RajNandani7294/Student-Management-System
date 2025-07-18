package com.StudentMngt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentMngt.Entity.Student;
import com.StudentMngt.Service.StudentService;

import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/Api")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/student")
	public ResponseEntity<Student> createrecord(@RequestBody Student student) {
		
	 return ResponseEntity.ok(studentService.createData(student));
	}
	@GetMapping()
	public ResponseEntity<List<Student>> getall(){
		return ResponseEntity.ok(studentService.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> getbyid(@PathVariable int id){
		return ResponseEntity.ok(studentService.getbyid(id));
	}
	
	@PutMapping("/student/{id}") 
	public ResponseEntity<?> updaterecord(@PathVariable int id, @RequestBody Student student){
		return ResponseEntity.ok(studentService.update(id, student));
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?>deleterecord(@PathVariable int id) {
		 return ResponseEntity.ok(studentService.delete(id));
	}

}
