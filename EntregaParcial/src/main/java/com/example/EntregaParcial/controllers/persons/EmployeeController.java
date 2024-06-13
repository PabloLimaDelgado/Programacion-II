package com.example.EntregaParcial.controllers.persons;

import com.example.EntregaParcial.controllers.BaseController;
import com.example.EntregaParcial.entities.enums.Role;
import com.example.EntregaParcial.entities.persons.Employee;
import com.example.EntregaParcial.services.persons.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmployeeController extends BaseController<Employee, Long> {
    @Autowired
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        super(employeeService);
        this.employeeService = employeeService;
    }

    @GetMapping("/role/{id}")
    public Role findByRoleById(@PathVariable Long id){
        return employeeService.findRoleById(id);
    }

    @GetMapping("/sucursales/{branchId}")
    public ResponseEntity<List<Employee>> listByBranch(Long branchId) throws Exception {
        List<Employee> employeeList = employeeService.listByBranch(branchId);
        return ResponseEntity.ok(employeeList);
    }
}
