package com.company.secuirtyjpaexample.repository;

import com.company.secuirtyjpaexample.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
