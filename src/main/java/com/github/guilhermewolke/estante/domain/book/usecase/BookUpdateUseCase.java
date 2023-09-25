package com.github.guilhermewolke.estante.domain.book.usecase;

import com.github.guilhermewolke.estante.domain.book.dto.BookUpdateInputDTO;
import com.github.guilhermewolke.estante.domain.book.dto.BookUpdateOutputDTO;
import com.github.guilhermewolke.estante.domain.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookUpdateUseCase {
    @Autowired
    private BookService service;

    public BookUpdateOutputDTO execute(BookUpdateInputDTO input) {
        return this.service.update(input);
    }
}
