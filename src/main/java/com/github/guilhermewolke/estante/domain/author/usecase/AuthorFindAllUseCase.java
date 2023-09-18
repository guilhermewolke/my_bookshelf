package com.github.guilhermewolke.estante.domain.author.usecase;

import com.github.guilhermewolke.estante.domain.author.dto.AuthorOutputDTO;
import com.github.guilhermewolke.estante.domain.author.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorFindAllUseCase {
    @Autowired
    private AuthorService service;

    public List<AuthorOutputDTO> execute() {
        return this.service.list();
    }

}
