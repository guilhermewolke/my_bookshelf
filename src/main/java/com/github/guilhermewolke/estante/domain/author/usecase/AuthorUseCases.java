package com.github.guilhermewolke.estante.domain.author.usecase;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Service
public class AuthorUseCases {

    @Autowired
    private AuthorFindAllUseCase listUseCase;
    @Autowired
    private AuthorDeleteUseCase deleteUseCase;

    @Autowired
    private AuthorFindByIDUseCase findByIDUseCase;

    @Autowired
    private AuthorInsertUseCase insertUseCase;

    @Autowired
    private AuthorUpdateUseCase updateUseCase;
}
