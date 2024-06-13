package com.example.EntregaParcial.entities.places;

import com.example.EntregaParcial.entities.Base;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "companias")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Setter
@Getter
public class Company extends Base {
    @Column(name = "nombre")
    private String name;
    @Column(name = "razon_social")
    private String reasonSocial;
    @Column(name = "cuil")
    private Integer cuil;

    //@OneToMany(mappedBy = "company")
    //@Builder.Default
    //private List<Branch> branches = new ArrayList<>();
}
