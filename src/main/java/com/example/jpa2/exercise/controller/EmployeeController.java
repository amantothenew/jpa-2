package com.example.jpa2.exercise.controller;

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

    @GetMapping("/employees/{pageNo}")
    public List<EmployeeDto> fetchAll(@PathVariable int pageNo) {
        return service.getAllAboveAverageEmployeeWithSorting(pageNo);
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

}
