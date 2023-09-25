package com.github.guilhermewolke.estante.domain.book.dto;

import com.github.guilhermewolke.estante.domain.author.dto.AuthorMapper;
import com.github.guilhermewolke.estante.domain.author.dto.AuthorOutputDTO;
import com.github.guilhermewolke.estante.domain.book.entity.BookEntity;
import com.github.guilhermewolke.estante.domain.publisher.dto.PublisherMapper;
import com.github.guilhermewolke.estante.domain.publisher.dto.PublisherOutputDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BookUpdateOutputDTO {

    private Integer id;

    private PublisherOutputDTO publisher;

    private List<AuthorOutputDTO> authors;

    private String title;

    private String category;
    private Boolean bought;
    private String ISBN;
    private Integer pages;
    private String format;

    public BookUpdateOutputDTO(BookEntity data) {
        this.id = data.getId();

        this.publisher = PublisherMapper.fromEntity(data.getPublisher());

        this.authors = AuthorMapper.fromEntityList(data.getAuthors());

        this.title = data.getTitle();
        this.category = data.getCategory().label;
        this.bought = data.getBought();
        this.ISBN = data.getISBN();
        this.pages = data.getPages();
        this.format = data.getFormat().label;
    }
}
