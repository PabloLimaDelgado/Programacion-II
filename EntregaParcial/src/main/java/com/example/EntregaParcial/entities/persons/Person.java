package com.example.EntregaParcial.entities.persons;

import com.example.EntregaParcial.entities.Base;
import com.example.EntregaParcial.entities.enums.Role;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Person extends Base implements Serializable {
    protected String firstName;
    protected String lastName;
    protected String phone;
    protected String email;
    protected String dateBirth;

    @Enumerated(EnumType.STRING)
    protected Role role;

    @OneToOne(cascade = CascadeType.MERGE)
    protected Image imagePerson;

    @OneToOne(cascade = CascadeType.MERGE)
    protected User user;
}
