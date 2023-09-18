package com.github.guilhermewolke.estante.domain.author.usecase;

import com.github.guilhermewolke.estante.domain.author.dto.AuthorFindByIDInputDTO;
import com.github.guilhermewolke.estante.domain.author.dto.AuthorOutputDTO;
import com.github.guilhermewolke.estante.domain.author.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorFindByIDUseCase {
    @Autowired
    private AuthorService service;

    public AuthorOutputDTO execute(AuthorFindByIDInputDTO input) {
        return this.service.findByID(input.getId());
    }
}
