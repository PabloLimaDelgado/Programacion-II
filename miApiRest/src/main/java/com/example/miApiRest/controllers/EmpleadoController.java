package com.example.miApiRest.controllers;

import com.example.miApiRest.entities.Empleado;
import com.example.miApiRest.entities.Rol;
import com.example.miApiRest.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoController{
    @Autowired
    private EmpleadoService empleadoService;

    @PostMapping("/empleados")
    public Empleado crearEmpleado(@RequestBody Empleado empleado){
        return empleadoService.createEmpleado(empleado);
    }
    @GetMapping("/empleados/{id}")
    public Empleado buscarEmpleadoPorId(@PathVariable Long id){
        return empleadoService.buscarEmpleadoId(id);
    }
    @GetMapping("/empleados")
    public List<Empleado> listarEmpleados(){
        return empleadoService.listarEmpleado();
    }

    @GetMapping("/empleados/rol{id}")
    public Rol rolEmpleado(Long id){
        return empleadoService.buscarRolEmpleado(id);
    }

    @PutMapping("/empleados")
    public Empleado actualizarEmpleado(@RequestBody Empleado empleado){
        return empleadoService.actualizarEmpleado(empleado);
    }
    @DeleteMapping("/empleados/{id}")
    public void eliminarEmpleados(@PathVariable Long id){
        empleadoService.eliminarPersona(id);
    }
}
