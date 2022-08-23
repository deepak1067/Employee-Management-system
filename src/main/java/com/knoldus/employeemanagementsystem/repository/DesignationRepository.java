package com.knoldus.employeemanagementsystem.repository;

import com.knoldus.employeemanagementsystem.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignationRepository extends JpaRepository<Designation,Long> {
}
