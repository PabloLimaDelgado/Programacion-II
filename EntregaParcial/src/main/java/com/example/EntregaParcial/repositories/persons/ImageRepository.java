package com.example.EntregaParcial.repositories.persons;

import com.example.EntregaParcial.entities.persons.Image;
import com.example.EntregaParcial.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends BaseRepository<Image, Long> {
}
