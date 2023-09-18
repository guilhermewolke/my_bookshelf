package com.github.guilhermewolke.estante.domain.author.usecase;

import com.github.guilhermewolke.estante.domain.author.dto.AuthorInsertInputDTO;
import com.github.guilhermewolke.estante.domain.author.dto.AuthorInsertOutputDTO;
import com.github.guilhermewolke.estante.domain.author.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorInsertUseCase {
    @Autowired
    private AuthorService service;

    public AuthorInsertOutputDTO execute(AuthorInsertInputDTO input) {
        System.out.println("Usecase Name:" + input.getName());
        return this.service.create(input);
    }
}
