package com.github.guilhermewolke.estante.domain.author.dto;

import com.github.guilhermewolke.estante.domain.author.entity.AuthorEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorOutputDTO {
    private Integer id;
    private String name;

    public AuthorOutputDTO(AuthorEntity data) {
        this.id = data.getId();
        this.name = data.getName();
    }
}
