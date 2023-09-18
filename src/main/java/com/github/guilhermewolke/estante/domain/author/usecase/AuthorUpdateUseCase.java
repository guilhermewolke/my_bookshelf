package com.github.guilhermewolke.estante.domain.author.usecase;

import com.github.guilhermewolke.estante.domain.author.dto.AuthorUpdateInputDTO;
import com.github.guilhermewolke.estante.domain.author.dto.AuthorUpdateOutputDTO;
import com.github.guilhermewolke.estante.domain.author.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorUpdateUseCase {
    @Autowired
    private AuthorService service;

    public AuthorUpdateOutputDTO execute(AuthorUpdateInputDTO input) {
        return this.service.update(input);
    }
}
