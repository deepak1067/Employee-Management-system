package com.knoldus.employeemanagementsystem.repository;

import com.knoldus.employeemanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
//    Employee getByName(String name);
//
//    Employee findByName(String name);
}
