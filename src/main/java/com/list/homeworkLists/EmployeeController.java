package com.list.homeworkLists;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) throws EmployeeAlreadyAddedException, EmployeeStorageIsFullException, EmployeeNotFoundException {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee add (@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) throws EmployeeAlreadyAddedException, EmployeeStorageIsFullException, EmployeeNotFoundException {
        return employeeService.addEmp(firstName, lastName);
    }

    @GetMapping("/remove")
    public Employee remove (@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) throws EmployeeNotFoundException {
        return employeeService.deleteEmp(firstName, lastName);
    }

    @GetMapping("/find")
    public Employee find (@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) throws EmployeeNotFoundException {
        return employeeService.searchEmp(firstName, lastName);
    }

    @GetMapping("showList")
    public Employee showList (){
        return employeeService.showList();
    }

   // @GetMapping("/add")
   // public String addEmpl(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName){
     //   return employeeService.addEmp(firstName, lastName);
    //}
}
