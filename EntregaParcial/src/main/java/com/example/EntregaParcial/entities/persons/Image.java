package com.example.EntregaParcial.entities.persons;

import com.example.EntregaParcial.entities.Base;
import com.example.EntregaParcial.entities.articles.Article;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "imagenes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Image extends Base {
    @Column(name = "denominacion")
    private String denomination;

}
