package com.example.jpa2.exercise.service;

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

    public List<EmployeeDto> getAllAboveAverageEmployeeWithSorting(int pageNo) {
        Sort sort = Sort.by(
                new Sort.Order(Sort.Direction.ASC, "age"),
                new Sort.Order(Sort.Direction.DESC, "salary")
        );
        Pageable page = PageRequest.of(pageNo, 10, sort);
        System.out.println(repo.getNameForAboveAverageSalariedEmployees(page));
        return repo.getNameForAboveAverageSalariedEmployees(page);
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
}
