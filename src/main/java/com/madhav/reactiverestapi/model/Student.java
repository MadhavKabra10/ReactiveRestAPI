package com.madhav.reactiverestapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Student")
public class Student {
    @Id
    private int Id;
    private String firstname;
    private String lastname;
    private int age;
}
