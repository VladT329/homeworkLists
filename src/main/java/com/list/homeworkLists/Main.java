package com.list.homeworkLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main extends EmployeeService{
    public static void main(String[] args) throws EmployeeStorageIsFullException, EmployeeAlreadyAddedException, EmployeeNotFoundException {
        EmployeeService employeeService = new EmployeeService();

        Employee emp1 = new Employee("John", "Markovich");
        Employee emp2 = new Employee("Liza", "Kovaleva");
        Employee emp3 = new Employee("Natasha", "Drozdova");
        //Employee emp3 = new Employee("Liza", "Kovaleva");
        Employee emp4 = new Employee("Debil", "Olegovich");

        employeeService.addEmp("John", "Markovich");
        employeeService.addEmp("Liza", "Kovaleva");
        //employeeService.addEmp("Liza", "Kovaleva");
        //employeeService.addEmp("Natasha", "Drozdova");

        //for (Employee employee : employeeService.employees){
          //  System.out.println("employee = " + employee);
        //}
    }
}
