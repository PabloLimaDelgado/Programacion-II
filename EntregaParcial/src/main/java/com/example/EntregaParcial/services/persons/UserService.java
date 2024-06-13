package com.example.EntregaParcial.services.persons;

import com.example.EntregaParcial.entities.persons.User;
import com.example.EntregaParcial.repositories.persons.UserRepository;
import com.example.EntregaParcial.services.BaseService;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User, Long> {
    public UserService(UserRepository userRepository){
        super(userRepository);
    }
}
