package com.github.guilhermewolke.estante.domain.book.usecase;

import com.github.guilhermewolke.estante.domain.book.dto.BookDeleteInputDTO;
import com.github.guilhermewolke.estante.domain.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookDeleteUseCase {

    @Autowired
    private BookService service;

    public void execute(BookDeleteInputDTO input) {
        this.service.remove(input.getId());
    }
}
