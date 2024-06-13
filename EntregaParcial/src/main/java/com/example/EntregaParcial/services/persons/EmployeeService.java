package com.example.EntregaParcial.services.persons;

import com.example.EntregaParcial.entities.enums.Role;
import com.example.EntregaParcial.entities.persons.Employee;
import com.example.EntregaParcial.repositories.persons.EmployeeRepository;
import com.example.EntregaParcial.services.BaseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService extends BaseService<Employee, Long> {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        super(employeeRepository);
        this.employeeRepository = employeeRepository;
    }

    public Role findRoleById(Long id){
        return employeeRepository.findById(id).orElse(null).getRole();
    }

    @Transactional
    public List<Employee> listByBranch(Long branchId) throws Exception {
        try{
            return employeeRepository.findAllByBranchId(branchId);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
