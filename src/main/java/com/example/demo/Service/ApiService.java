package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Student;
import com.example.demo.Repository.StudentRepo;
@Service
public class ApiService {
	@Autowired 
	StudentRepo  stRepo; 
	
	public Student saveDetails(Student e) {
		return stRepo.save(e);
	}
	public List <Student>getDetails()

{
		return stRepo.findAll();
		
}
	public Student UpdateDetails(Student e1)
	{
		return stRepo.saveAndFlush(e1);
	}
	
	public void deleteDetails (int id)
	{		
	
	    stRepo.deleteById(id);	
	
	}
}