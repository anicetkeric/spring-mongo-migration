package com.sample.springmongomigration.config.dbmigrations;

import com.sample.springmongomigration.domain.Employee;
import io.mongock.api.annotations.ChangeUnit;
import io.mongock.api.annotations.Execution;
import io.mongock.api.annotations.RollbackExecution;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Update collection.
 */
@ChangeUnit(id = "DB-update", order = "2", author = "bootlabs")
public class DatabaseUpdateChangeLog {

    private final MongoTemplate template;

    public DatabaseUpdateChangeLog(MongoTemplate template) {
        this.template = template;
    }

    @Execution
    public void updateEmployees() {

        template.findAll(Employee.class).forEach(employee -> {
            employee.setSalary(100.0);
            template.save(employee);
        });
    }

    @RollbackExecution
    public void rollback() {
        template.findAll(Employee.class).forEach(employee -> {
            employee.setSalary(0.0);
            template.save(employee);
        });
    }

}
