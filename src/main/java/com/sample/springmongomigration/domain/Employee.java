package com.sample.springmongomigration.domain;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "employee")
public class Employee {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    private String email;

    @NonNull
    private Department department;
}