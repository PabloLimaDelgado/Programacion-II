package com.example.EntregaParcial.services;

import com.example.EntregaParcial.entities.Base;
import com.example.EntregaParcial.repositories.BaseRepository;
import jakarta.transaction.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseService <E extends Base, ID extends Serializable>{
    protected BaseRepository<E, ID> baseRepository;

    public BaseService(BaseRepository<E, ID> baseRepository){
        this.baseRepository = baseRepository;
    }

    @Transactional
    public List<E> list() throws Exception {
        try {
            return baseRepository.findAll();
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public Optional<E> searchById(ID id) throws Exception {
        try {
            return Optional.ofNullable(baseRepository.findById(id).orElse(null));
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public E create(E entity) throws Exception {
        try {
            return baseRepository.save(entity);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }

    @Transactional
    public E update(E entity) throws Exception {
        try {
            return baseRepository.save(entity);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public void delete(ID id) throws Exception{
        try {
            baseRepository.deleteById(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
