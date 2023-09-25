package com.github.guilhermewolke.estante.domain.book.usecase;

import com.github.guilhermewolke.estante.domain.book.dto.BookOutputDTO;
import com.github.guilhermewolke.estante.domain.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookFindAllUseCase {

    @Autowired
    private BookService service;

    public Page<BookOutputDTO> execute(Pageable pagination) {
        return this.service.list(pagination);
    }
}
