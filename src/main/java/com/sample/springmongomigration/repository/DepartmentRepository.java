package com.sample.springmongomigration.repository;

import com.sample.springmongomigration.domain.Department;
import lombok.NonNull;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * Spring Data MongoDB repository for the {@link Department} entity.
 */
public interface DepartmentRepository extends MongoRepository<Department, String> {

    Optional<Department> findAllByCode(@NonNull String code);
}
