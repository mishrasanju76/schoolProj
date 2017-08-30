/**
 * 
 */
package com.school.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.school.model.Employee;

/**
 * @author ArpitaAaryan
 *
 */
@RestResource(path="employees", rel="employee")
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
