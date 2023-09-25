package com.github.guilhermewolke.estante.domain.book.usecase;

import com.github.guilhermewolke.estante.domain.book.dto.BookInsertInputDTO;
import com.github.guilhermewolke.estante.domain.book.dto.BookInsertOutputDTO;
import com.github.guilhermewolke.estante.domain.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookInsertUseCase {

    @Autowired
    private BookService service;

    public BookInsertOutputDTO execute(BookInsertInputDTO input) {
        return this.service.create(input);
    }
}
