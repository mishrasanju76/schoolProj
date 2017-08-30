/**
 * 
 */
package com.school;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.school.model.School;

/**
 * @author ArpitaAaryan
 *
 */
@RestResource(path="schools", rel="school")
public interface SchoolRepository extends CrudRepository<School,Long>{

}
