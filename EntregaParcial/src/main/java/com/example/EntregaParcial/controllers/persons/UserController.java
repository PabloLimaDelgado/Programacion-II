package com.example.EntregaParcial.controllers.persons;

import com.example.EntregaParcial.controllers.BaseController;
import com.example.EntregaParcial.entities.persons.User;
import com.example.EntregaParcial.services.persons.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UserController extends BaseController<User, Long> {
    public UserController(UserService userService){
        super(userService);
    }
}
