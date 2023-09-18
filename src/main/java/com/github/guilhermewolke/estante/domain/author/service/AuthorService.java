package com.github.guilhermewolke.estante.domain.author.service;

import com.github.guilhermewolke.estante.domain.author.dto.*;
import com.github.guilhermewolke.estante.domain.author.entity.AuthorEntity;
import com.github.guilhermewolke.estante.domain.author.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository repository;

    public AuthorInsertOutputDTO create(AuthorInsertInputDTO data) {
        AuthorEntity entity = new AuthorEntity(null, data.getName());
        this.repository.save(entity);
        return new AuthorInsertOutputDTO(entity);
    }

    public List<AuthorOutputDTO> list() {
        List<AuthorOutputDTO> list = new ArrayList<>();

        List<AuthorEntity> Authors = this.repository.findAll();

        Authors.forEach(p -> list.add(new AuthorOutputDTO(p)));
        return list;
    }

    public AuthorOutputDTO findByID(Integer id) {
        AuthorEntity Author = this.repository.getReferenceById(id);
        return new AuthorOutputDTO(Author);
    }

    public AuthorUpdateOutputDTO update(AuthorUpdateInputDTO data) {
        AuthorEntity updated = new AuthorEntity(data.getId(), data.getName());
        this.repository.save(updated);
        return new AuthorUpdateOutputDTO(updated);
    }

    public void remove(Integer id) {
        AuthorEntity Author = this.repository.getReferenceById(id);
        this.repository.delete(Author);
    }
}
