package com.sample.springmongomigration.repository;

import com.sample.springmongomigration.domain.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the {@link Employee} entity.
 */
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
