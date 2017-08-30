package com.school;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.school.model.Employee;
import com.school.model.School;

@SpringBootApplication
public class SchoolProjApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(SchoolProjApplication.class, args);
	}
	
	@Autowired
	SchoolRepository schoolRepository;
	
	@PostConstruct
	public void init(){
		List<School> schoolList = new ArrayList<School>();
		
		Set<Employee> set = new HashSet<Employee>();
		set.add(new Employee("Aaryan","Student"));
		set.add(new Employee("Sanjay","Teacher"));
		set.add(new Employee("Arpita","Staff"));
		
		schoolList.add(new School("Ryan","Ghaziabad",set));
		schoolList.add(new School("DPS","Noida",null));
		
		
		/*School school =  new School();
		school.setName("Ryan International");
		school.setLocation("Ghaziabad");
		schoolList.add(school);
		
		School school1 =  new School();
		school1.setName("Ryan International");
		school1.setLocation("Noida");
		schoolList.add(school1);*/
		schoolRepository.save(schoolList);
	}
	
}
