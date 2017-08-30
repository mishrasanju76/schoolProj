/**
 * 
 */
package com.school.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.SchoolRepository;
import com.school.model.School;

/**
 * @author ArpitaAaryan
 *
 */
//@RestController
public class SchoolController {

	@Autowired
	SchoolRepository schoolRepository;
	
	@RequestMapping("/schools")
	public Iterable<School> getSchools(){
		
		/*List<School> schoolList = new ArrayList<School>();
		
		School school =  new School();
		school.setId(new Long(1));
		school.setName("Ryan International");
		school.setLocation("Ghaziabad");
		schoolList.add(school);
		
		School school1 =  new School();
		school1.setId(new Long(2));
		school1.setName("Ryan International");
		school1.setLocation("Noida");
		schoolList.add(school1);*/
		
		return schoolRepository.findAll();
		//return "hello";
	}
	
	@RequestMapping("/schools/{id}")
	public School getSchool(@PathVariable Long id){
		return schoolRepository.findOne(id);
		
	}
}
