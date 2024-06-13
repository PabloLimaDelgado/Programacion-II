package com.example.EntregaParcial.repositories.persons;

import com.example.EntregaParcial.entities.persons.Employee;
import com.example.EntregaParcial.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends BaseRepository<Employee, Long> {
    List<Employee> findAllByBranchId(Long branchId);
}
