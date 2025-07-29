package com.example.jpa2.exercise.service;

import com.example.jpa2.exercise.dto.EmployeeAgeAndNameDto;
import com.example.jpa2.exercise.dto.EmployeeDto;
import com.example.jpa2.exercise.entity.Employee;
import com.example.jpa2.exercise.repository.EmployeeRepo;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeService {

    EmployeeRepo repo;

    public EmployeeService(EmployeeRepo repo) {
        this.repo = repo;
    }

    public List<EmployeeDto> getAllAboveAverageEmployeeWithSorting() {
        return repo.getNameForAboveAverageSalariedEmployees();
    }

    public List<Employee> saveAll(List<Employee> emp) {
        return repo.saveAll(emp);
    }

    public int updateMinimumSalariedPerson(long newSalary) {
        double avgSalary = repo.findAverageSalary();
        return repo.updateMinimumSalariedPerson(newSalary, avgSalary);
    }

    public String deleteEmployeeWithMinSalary() {
        List<Employee> emp = repo.findEmployeeWithMinSalary();
        repo.deleteAll(emp);
        return "Deleted " + emp.size() + " employee";
    }

    //Q2------------------------------------------------->
    public List<EmployeeAgeAndNameDto> EmployeeWithlastnameSuffix(String suffix) {
        return repo.getEmployeeWithSuffix(suffix);
    }

    public String deleteEmpWithAgeGreaterThen(int givenAge) {
        return repo.deleteEmployeeWithAgeGreaterThen(givenAge) + " Employees deleted";
    }


}
