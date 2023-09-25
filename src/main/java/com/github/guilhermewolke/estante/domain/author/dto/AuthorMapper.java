package com.github.guilhermewolke.estante.domain.author.dto;

import com.github.guilhermewolke.estante.domain.author.entity.AuthorEntity;

import java.util.ArrayList;
import java.util.List;

public class AuthorMapper {
    public static List<AuthorOutputDTO> fromEntityList(List<AuthorEntity> authors) {
        List<AuthorOutputDTO> list = new ArrayList<AuthorOutputDTO>();

        authors.forEach(author -> list.add(new AuthorOutputDTO(author)));
        return list;
    }

    public static AuthorOutputDTO fromEntity(AuthorEntity author) {
        return new AuthorOutputDTO(author);
    }
}
