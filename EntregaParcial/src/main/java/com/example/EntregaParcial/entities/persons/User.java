package com.example.EntregaParcial.entities.persons;

import com.example.EntregaParcial.entities.Base;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class User extends Base {

    @Column(name = "auth_id")
    private String auth0Id;

    @Column(name = "user_name")
    private String userName;
}
