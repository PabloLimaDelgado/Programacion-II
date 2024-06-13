package com.example.EntregaParcial.repositories.persons;

import com.example.EntregaParcial.entities.persons.User;
import com.example.EntregaParcial.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User, Long> {
}
