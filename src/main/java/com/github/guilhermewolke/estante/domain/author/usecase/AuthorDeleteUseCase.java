package com.github.guilhermewolke.estante.domain.author.usecase;

import com.github.guilhermewolke.estante.domain.author.dto.AuthorDeleteInputDTO;
import com.github.guilhermewolke.estante.domain.author.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorDeleteUseCase {
    @Autowired
    private AuthorService service;

    public void execute(AuthorDeleteInputDTO input) {
        this.service.remove(input.getId());
    }
}
