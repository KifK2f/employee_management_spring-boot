package com.iai.employeesManagement.controller;

import com.iai.employeesManagement.model.Employee;
import com.iai.employeesManagement.service.ServiceImpl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    @Autowired
    EmployeeServiceImpl employeeService;

    @GetMapping("/employees")
    public List<Employee> listeEmploye(){
        return employeeService.showEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable Long id){
        return employeeService.getOneEmployee(id);
    }

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveOneEmployee(employee);
    }

    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable Long id, Employee employee){
        employee.setId(id);
        return employeeService.saveOneEmployee(employee);
    }

    @DeleteMapping("/employee/{id}")
    public void supprimerEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }




}
