package edu.poly.lab4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.poly.lab4.respoitory.EmployeeRespository;
import edu.poly.lab4.entity.Employee;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee saveEmployee(@Repository Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employee/{id")
    public Employee getEmployeeById(@pathVariable("id") Long employeeId){
        return  employeeService.getEmployeeById(employeeId);

    }
}
