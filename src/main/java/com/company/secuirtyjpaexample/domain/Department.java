package com.company.secuirtyjpaexample.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String city;

    @OneToMany(mappedBy = "department")
    private Set<Employee> employees;

}
