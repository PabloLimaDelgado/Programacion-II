package com.example.miApiRest.services;

import com.example.miApiRest.entities.Empleado;
import com.example.miApiRest.entities.Persona;
import com.example.miApiRest.entities.Rol;
import com.example.miApiRest.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService extends PersonaService{
    @Autowired
    private EmpleadoRepository empleadoRepository;
    public Empleado createEmpleado(Empleado empleado){
        return empleadoRepository.save(empleado);
    }
    public Empleado buscarEmpleadoId(Long id){
        return empleadoRepository.findById(id).orElse(null);
    }
    public List<Empleado> listarEmpleado(){
        return empleadoRepository.findAll();
    }
    public Empleado actualizarEmpleado(Empleado empleado){
        return empleadoRepository.save(empleado);
    }
    public void eliminarEmpleado(Long id){
        empleadoRepository.deleteById(id);
    }
    public Rol buscarRolEmpleado(Long id){
        return empleadoRepository.findById(id).orElse(null).getRol();
    }
}
