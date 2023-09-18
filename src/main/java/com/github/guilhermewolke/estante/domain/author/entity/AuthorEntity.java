package com.github.guilhermewolke.estante.domain.author.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name="Author")
@Table(name="author")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
@ToString
public class AuthorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
}
