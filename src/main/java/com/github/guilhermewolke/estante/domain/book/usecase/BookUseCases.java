package com.github.guilhermewolke.estante.domain.book.usecase;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Service
public class BookUseCases {

    @Autowired
    private BookDeleteUseCase deleteUseCase;

    @Autowired
    private BookFindAllUseCase findAllUseCase;

    @Autowired
    private BookFindByIDUseCase findByIDUseCase;

    @Autowired
    private BookInsertUseCase insertUseCase;

    @Autowired
    private BookUpdateUseCase updateUseCase;
}
