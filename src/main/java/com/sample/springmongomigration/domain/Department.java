package com.sample.springmongomigration.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    private String id;

    @NonNull
    private String code;

    private String name;
}
