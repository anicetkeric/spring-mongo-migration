package com.sample.springmongomigration.config.dbmigrations;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.sample.springmongomigration.repository.EmployeeRepository;

/**
 * Update collection.
 */
@ChangeLog(order = "002")
public class DatabaseUpdateChangeLog {

    @ChangeSet(order = "002", id = "update_employees", author = "aek")
    public void updateEmployees(EmployeeRepository employeeRepository) {

        employeeRepository.findAll().forEach(employee -> {
            employee.setSalary(0.0);
            employeeRepository.save(employee);
        });
    }

}
