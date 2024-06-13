package com.example.EntregaParcial.controllers;

import com.example.EntregaParcial.entities.Base;
import com.example.EntregaParcial.services.BaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseController <E extends Base, ID extends Serializable>{
    protected BaseService<E, ID> service;

    public BaseController(BaseService<E, ID> service){
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<List<E>> list() throws Exception{
        List<E> entities = service.list();
        return ResponseEntity.ok(entities);
    }

    @GetMapping("/{id}")
    public Optional<E> searchById(@PathVariable ID id) throws Exception{
        return service.searchById(id);
    }

    @PostMapping()
    public ResponseEntity<E> create(@RequestBody E entity) throws Exception{
        E createEntitie = service.create(entity);
        return ResponseEntity.ok(createEntitie);
    }

    @PutMapping()
    public ResponseEntity<E> update(@RequestBody E entity) throws Exception{
        E updateEntity = service.update(entity);
        return ResponseEntity.ok(updateEntity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ID id) throws Exception{
        service.delete(id);
    }
}
