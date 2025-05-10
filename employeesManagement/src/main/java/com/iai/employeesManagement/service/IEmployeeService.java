package com.iai.employeesManagement.service;

import com.iai.employeesManagement.model.Employee;

import java.util.List;

public interface IEmployeeService {
    public List<Employee> showEmployees();

    public Employee saveOneEmployee(Employee employee);

    public Employee getOneEmployee(Long id);

    public void deleteEmployee(Long id);

}
