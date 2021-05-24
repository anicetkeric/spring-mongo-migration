package com.sample.springmongomigration.config.dbmigrations;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.sample.springmongomigration.domain.Department;
import com.sample.springmongomigration.domain.Employee;
import com.sample.springmongomigration.repository.DepartmentRepository;
import com.sample.springmongomigration.repository.EmployeeRepository;

import java.util.Optional;

/**
 * Creates the initial database setup.
 */
@ChangeLog(order = "001")
public class DatabaseInitChangeLog {


    @ChangeSet(order = "001", id = "init_departments", author = "aek")
    public void initDepartments(DepartmentRepository departmentRepository) {
        departmentRepository.save(Department.builder()
                .name("Human Resource Management")
                .code("HR")
                .build());
        departmentRepository.save(Department.builder()
                .name("R&D")
                .code("Research and Development (often abbreviated to R&D)")
                .build());
        departmentRepository.save(Department.builder()
                .name("Prod")
                .code("Production")
                .build());
    }

    @ChangeSet(order = "002", id = "init_Employee_HR", author = "aek")
    public void initHrEmployees(EmployeeRepository employeeRepository,
                              DepartmentRepository departmentRepository) {
        Optional<Department> hrDepartment = departmentRepository.findAllByCode("HR");

        if (hrDepartment.isPresent()){
            Employee employee1 = employeeRepository.save(Employee.builder()
                    .firstName("Dioms")
                    .lastName("Kane")
                    .email("diom.kan@yahoo.fr")
                    .department(hrDepartment.get())
                    .build());
            employeeRepository.save(employee1);

            Employee employee2 = employeeRepository.save(Employee.builder()
                    .firstName("Astrid")
                    .lastName("Flob")
                    .email("f.astrid@demo.com")
                    .department(hrDepartment.get())
                    .build());
            employeeRepository.save(employee2);
        }
    }
    @ChangeSet(order = "003", id = "init_Employee_RAD", author = "aek")
    public void initRadEmployees(EmployeeRepository employeeRepository,
                              DepartmentRepository departmentRepository) {
        Optional<Department> radDepartment = departmentRepository.findAllByCode("R&D");

        if (radDepartment.isPresent()){
            Employee employee1 = employeeRepository.save(Employee.builder()
                    .firstName("Luis")
                    .lastName("Siruis")
                    .email("siruis.luis@test.com")
                    .department(radDepartment.get())
                    .build());
            employeeRepository.save(employee1);
        }
    }


}
