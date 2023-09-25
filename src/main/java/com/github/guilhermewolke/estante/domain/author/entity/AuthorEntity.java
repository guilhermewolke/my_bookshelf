package com.github.guilhermewolke.estante.domain.author.entity;

import com.github.guilhermewolke.estante.domain.book.entity.BookEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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

    @ManyToMany(mappedBy = "authors")
    private List<BookEntity> books;

    public AuthorEntity(String name) {
        this.name = name;
    }

    public AuthorEntity(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
