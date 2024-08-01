package com.list.homeworkLists;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService{
    List<Employee> employees = new ArrayList<>();
    private int maxValueEmployees = 3;

    public void addEmp (String firstName, String lastName) throws EmployeeStorageIsFullException, EmployeeNotFoundException, EmployeeAlreadyAddedException {
        boolean alreadyAdd = searchEmpPrivate(firstName, lastName) != null;
        if (alreadyAdd) throw new EmployeeAlreadyAddedException();
        if (employees.size()<maxValueEmployees) {
            Employee employee = new Employee(firstName, lastName);
            employees.add(employee);
        } else {
            throw new EmployeeStorageIsFullException();
        }
    }

    private Employee searchEmpPrivate (String firstName, String lastName){
        for (Employee employee : employees){
            if (employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)){
                return employee;
            }
        }
        return null;
    }

    public Employee searchEmp (String firstName, String lastName) throws EmployeeNotFoundException{
        for (Employee employee : employees){
            if (employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)){
                return employee;
            }
        }
        throw new EmployeeNotFoundException();
    }

    public void deleteEmp (String firstName, String lastName) throws EmployeeNotFoundException {
        Employee employee = new Employee(firstName, lastName);
        searchEmp(firstName, lastName);
        employees.remove(employee);
    }
}
