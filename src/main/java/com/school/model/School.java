/**
 * 
 */
package com.school.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * @author ArpitaAaryan
 *
 */
@Entity
public class School {
	@Id
	@GeneratedValue
	private Long schoolId;
	private String name;
	private String location;
	@OneToMany(cascade= CascadeType.ALL)
	@JoinColumn(name="schoolId")
	private Set<Employee> employees;
	
	//retain a default constructor
	public School(){
		
	}
	
	public School(String name,String location, Set<Employee> employees){
		this.name = name;
		this.location = location;
		this.employees = employees;
	}
	
	/**
	 * @return the employees
	 */
	public Set getEmployees() {
		return employees;
	}
	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(Set employees) {
		this.employees = employees;
	}
	
	/**
	 * @return the id
	 */
	public Long getSchoolId() {
		return schoolId;
	}
	/**
	 * @param id the id to set
	 */
	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

}
