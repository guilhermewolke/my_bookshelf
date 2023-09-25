package com.github.guilhermewolke.estante.domain.book.usecase;

import com.github.guilhermewolke.estante.domain.book.dto.BookFindByIDInputDTO;
import com.github.guilhermewolke.estante.domain.book.dto.BookOutputDTO;
import com.github.guilhermewolke.estante.domain.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookFindByIDUseCase {

    @Autowired
    private BookService service;

    public BookOutputDTO execute(BookFindByIDInputDTO input) {
        return this.service.findByID(input.getId());
    }
}
