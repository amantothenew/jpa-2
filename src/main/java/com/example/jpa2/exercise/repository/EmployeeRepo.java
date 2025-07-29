package com.example.jpa2.exercise.repository;

import com.example.jpa2.exercise.dto.EmployeeAgeAndNameDto;
import com.example.jpa2.exercise.dto.EmployeeDto;
import com.example.jpa2.exercise.entity.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    @Query("SELECT new com.example.jpa2.exercise.dto.EmployeeDto(e.firstName, e.lastName) FROM Employee e WHERE e.salary > (SELECT AVG(e2.salary) FROM Employee e2) order by e.age ASC, e.salary DESC")
    List<EmployeeDto> getNameForAboveAverageSalariedEmployees();

    @Transactional
    @Modifying
    @Query("update Employee e SET e.salary = :newSalary where e.salary< :avgSalary")
    int updateMinimumSalariedPerson(@Param("newSalary") long newSalary, @Param("avgSalary") double avgSalary);

    @Query("select AVG(e.salary) from Employee e")
    double findAverageSalary();

    @Query("select e from Employee e where e.salary = (Select MIN(e2.salary) from Employee e2)")
    List<Employee> findEmployeeWithMinSalary();

//    Q2 ----------------------------------------------------------------->


    @Query("SELECT new com.example.jpa2.exercise.dto.EmployeeAgeAndNameDto(e.firstName, e.lastName, e.age) FROM Employee e WHERE e.lastName LIKE %:suffix")
    List<EmployeeAgeAndNameDto> getEmployeeWithSuffix(@Param("suffix") String suffix);

    @Modifying
    @Transactional
    @Query("delete from Employee e where e.age > :givenAge")
    int deleteEmployeeWithAgeGreaterThen(@Param("givenAge") int givenAge);
}


