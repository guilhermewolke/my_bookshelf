package com.github.guilhermewolke.estante.domain.book.service;

import com.github.guilhermewolke.estante.domain.author.dto.*;
import com.github.guilhermewolke.estante.domain.author.entity.AuthorEntity;
import com.github.guilhermewolke.estante.domain.author.repository.AuthorRepository;
import com.github.guilhermewolke.estante.domain.book.dto.*;
import com.github.guilhermewolke.estante.domain.book.entity.BookEntity;
import com.github.guilhermewolke.estante.domain.book.repository.BookRepository;
import com.github.guilhermewolke.estante.domain.publisher.entity.PublisherEntity;
import com.github.guilhermewolke.estante.domain.publisher.repository.PublisherRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private PublisherRepository publisherRepository;

    public BookInsertOutputDTO create(BookInsertInputDTO data) {
        //validando existência de editora pelo ID
        if (!publisherRepository.existsById(data.getPublisherId())) {
            throw new EntityNotFoundException("Editora inexistente");
        }

        //validando existência de autor pelo ID
        data.getAuthors().forEach(authorID -> {
            if (!authorRepository.existsById(authorID)) {
                throw new EntityNotFoundException("Autor inexistente");
            }
        });

        //Preparação dos relacionamentos
        PublisherEntity publisher;
        List<AuthorEntity> authors = new ArrayList<AuthorEntity>();
        publisher = publisherRepository.getReferenceById(data.getPublisherId());
        data.getAuthors().forEach(authorID -> {
            authors.add(authorRepository.getReferenceById(authorID));
        });

        BookEntity entity = new BookEntity(null, publisher, authors, data.getTitle(), data.getCategory(), data.getBought(), data.getISBN(), data.getPages(), data.getFormat());
        this.repository.save(entity);
        return new BookInsertOutputDTO(entity);
    }

    public Page<BookOutputDTO> list(Pageable pagination) {
        Page<BookOutputDTO> books = this.repository.findAll(pagination).map(BookOutputDTO::new);

        return books;
    }

    public BookOutputDTO findByID(Integer id) {
        BookEntity book = this.repository.getReferenceById(id);
        return new BookOutputDTO(book);
    }

    public BookUpdateOutputDTO update(BookUpdateInputDTO data) {
        PublisherEntity publisher = null;

        if (!repository.existsById(data.getId())) {
            throw new EntityNotFoundException("Livro inexistente");
        }

        if (data.getPublisherId() != null) {
            if (publisherRepository.existsById(data.getPublisherId())) {
                publisher = publisherRepository.getReferenceById(data.getPublisherId());
            }
        }

        List<AuthorEntity> authors = null;

        if (data.getAuthors() != null && !data.getAuthors().isEmpty()) {
            data.getAuthors().forEach(authorID -> {
                authors.add(authorRepository.getReferenceById(authorID));
            });
        }

        BookEntity book = repository.getReferenceById(data.getId());

        book.update(data, publisher, authors);

        this.repository.save(book);
        return new BookUpdateOutputDTO(book);
    }

    public void remove(Integer id) {
        BookEntity book = this.repository.getReferenceById(id);
        this.repository.delete(book);
    }
}
