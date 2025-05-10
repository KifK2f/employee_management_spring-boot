package com.iai.employeesManagement.service.ServiceImpl;

import com.iai.employeesManagement.model.Employee;
import com.iai.employeesManagement.repository.EmployeeRepository;
import com.iai.employeesManagement.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> showEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveOneEmployee(Employee employee) {

        employee.setMatricule
        (
                UUID.randomUUID().toString().substring(0,4).toUpperCase()
                +employee.getName().substring(0,2).toUpperCase()
                +employee.getFirstname().substring(0,2).toUpperCase()
                +employee.getAge().toString()
                +employee.getHireDate().getYear()
                +employee.getBirthdate().getYear()
                +employee.getSex().toString()
        );
        return employeeRepository.save(employee);
    }
    /*Initialize your Date however you like it.
            Date date = new Date();
    Calendar calendar = new GregorianCalendar();
calendar.setTime(date);
    int year = calendar.get(Calendar.YEAR);
    //Add one to month {0 - 11}
    int month = calendar.get(Calendar.MONTH) + 1;
    int day = calendar.get(Calendar.DAY_OF_MONTH);
    */
    /*UUID.randomUUID() : Génère un identifiant unique universel.
     toString() : Convertit le UUID en une chaîne de caractères.
    substring(0, 4) : Extrait les 4 premiers caractères.
    toUpperCase() : Met les caractères en majuscules*/
    //Universal Unique Identifier = UUID
    /*L'abréviation UUID signifie Universal Unique IDentifier ,
     parfois également appelé GUID (Globally Unique IDentifier).
     Il s'agit d'un entier de 128 bits utilisé pour l'identification
     des données dans les systèmes informatiques.*/

    @Override
    public Employee getOneEmployee(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}

