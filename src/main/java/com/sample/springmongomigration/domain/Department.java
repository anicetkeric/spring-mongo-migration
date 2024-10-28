package com.sample.springmongomigration.domain;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "department")
public class Department {

    @Id
    private String id;

    @NotNull
    private String code;

    private String name;
}
