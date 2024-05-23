package com.marciobueno.aos.sb001;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {

    List<Employee> findEmployeesByRegion(String region);

    @Query("select emp from Employee emp where emp.dosh >= ?1 and emp.dosh <= ?2")
    List<Employee> findEmployeesInSalaryRange(double from, double to);

    Page<Employee> findEmployeesByDoshGreaterThan(double salary, Pageable pageable);
}

