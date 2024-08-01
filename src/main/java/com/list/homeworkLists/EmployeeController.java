package com.list.homeworkLists;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

   // @GetMapping("/add")
   // public String addEmpl(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName){
     //   return employeeService.addEmp(firstName, lastName);
    //}
}
