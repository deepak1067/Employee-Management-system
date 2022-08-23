package com.knoldus.employeemanagementsystem.service;

import com.knoldus.employeemanagementsystem.entity.Employee;
import com.knoldus.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

//    public List<Employee> addAllEmployees(List<Employee> employees) {
//        return  employeeRepository.saveAll(employees);
//    }

    public Employee getEmployeeByID(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

//    public Employee getEmployeeByName(String name) {
//        return  employeeRepository.findByName(name);
//    }

    public Employee updateEmployee(Employee employee) {
        Employee existingEMP = employeeRepository.findById(employee.getId()).orElse(null);
        System.out.println(employee);
        if(existingEMP == null) {
            System.out.println("Emp not found");
            return  employeeRepository.save(employee);
        }else  {
            existingEMP.setName(employee.getName());
            existingEMP.setEmail(employee.getEmail());
//            existingEMP.setSalary(employee.getSalary());
            employeeRepository.save(existingEMP);
        }
        return employee;
    }

    public void deleteEmployeeByID(Long id) {
//        Employee existingEMP = employeeRepository.getById(id);
//        if(existingEMP != null) {
        employeeRepository.deleteById(id);
//            return true;
//        }
//        return false;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
