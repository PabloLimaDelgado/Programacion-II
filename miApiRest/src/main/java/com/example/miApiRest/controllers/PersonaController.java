package com.example.miApiRest.controllers;

import com.example.miApiRest.entities.Persona;
import com.example.miApiRest.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    private PersonaService personaService;
    @PostMapping("/personas")
    public Persona crearPersona(@RequestBody Persona persona){
        return personaService.createPersona(persona);
    }
    @GetMapping("/personas/{id}")
    public Persona buscarPersonaPorId(@PathVariable Long id){
        return personaService.buscarPersonaId(id);
    }
    @GetMapping("/personas")
    public List<Persona> listarPersona(){
        return personaService.listarPersonas();
    }
    @PutMapping("/personas")
    public Persona actualizarPersona(@RequestBody Persona persona){
        return personaService.actualizarPersona(persona);
    }
    @DeleteMapping("/personas/{id}")
    public void eliminarPersona(@PathVariable Long id){
        personaService.eliminarPersona(id);
    }
}
