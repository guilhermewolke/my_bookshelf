package com.github.guilhermewolke.estante.domain.book.entity;

import com.github.guilhermewolke.estante.domain.author.entity.AuthorEntity;
import com.github.guilhermewolke.estante.domain.book.dto.BookInsertInputDTO;
import com.github.guilhermewolke.estante.domain.book.dto.BookUpdateInputDTO;
import com.github.guilhermewolke.estante.domain.publisher.entity.PublisherEntity;
import com.github.guilhermewolke.estante.domain.publisher.service.PublisherService;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name="Book")
@Table(name="book")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
@ToString
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="publisher_id")
    private PublisherEntity publisher;

    @ManyToMany
    @JoinTable(
        name="author_book",
        joinColumns = @JoinColumn(name="book_id"),
        inverseJoinColumns = @JoinColumn(name="author_id")
    )
    private List<AuthorEntity> authors;

    private String title;

    @Enumerated(EnumType.STRING)
    private BookCategory category;
    private Boolean bought;
    private String ISBN;
    private Integer pages;
    @Enumerated(EnumType.STRING)
    private BookFormat format;

    public void update(BookUpdateInputDTO data, PublisherEntity publisher, List<AuthorEntity> authors) {
        if (authors != null) {
            this.authors = authors;
        }

        if (publisher != null) {
            this.publisher = publisher;
        }

        if (data.getTitle() != null) {
            this.title = data.getTitle();
        }

        if (data.getCategory() != null) {
            this.category = data.getCategory();
        }

        if (data.getBought() != null) {
            this.bought = data.getBought();
        }

        if (data.getISBN() != null) {
            this.ISBN = data.getISBN();
        }

        if (data.getPages() != null) {
            this.pages = data.getPages();
        }

        if (data.getFormat() != null) {
            this.format = data.getFormat();
        }
    }
}
