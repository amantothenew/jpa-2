package com.example.jpa2.exercise.controller;

import com.example.jpa2.exercise.dto.EmployeeAgeAndNameDto;
import com.example.jpa2.exercise.dto.EmployeeDto;
import com.example.jpa2.exercise.entity.Employee;
import com.example.jpa2.exercise.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/employees")
    public List<EmployeeDto> fetchAll() {
        return service.getAllAboveAverageEmployeeWithSorting();
    }

    @PostMapping("/employees")
    public List<Employee> saveAll(@RequestBody List<Employee> emp) {
        return service.saveAll(emp);
    }

    @DeleteMapping("/employees")
    public List<Employee> getAllWithMinimumSalary(@RequestBody List<Employee> emp) {
        return service.saveAll(emp);
    }

    @PutMapping("/employees/update-salary")
    public int updateMinimumSalariedPerson(@RequestParam long newSalary) {
        return service.updateMinimumSalariedPerson(newSalary);
    }

    @DeleteMapping("/employees/min-salary")
    public String deleteEmpWithMinSalary() {
        return service.deleteEmployeeWithMinSalary();
    }


//    Q2--------------------------------------------------------------------->

    @GetMapping("/employees/with/{suffix}")
    public List<EmployeeAgeAndNameDto> getMatchingWithSuffix(@PathVariable String suffix) {
        return service.EmployeeWithlastnameSuffix(suffix);
    }


    @DeleteMapping("/employees/age")
    public String deleteEmpWithAgeGreaterThen(@RequestParam int age) {
        return service.deleteEmpWithAgeGreaterThen(age);
    }

}
