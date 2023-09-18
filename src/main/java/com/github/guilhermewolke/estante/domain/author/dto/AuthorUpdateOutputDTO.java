package com.github.guilhermewolke.estante.domain.author.dto;

import com.github.guilhermewolke.estante.domain.author.entity.AuthorEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AuthorUpdateOutputDTO {
    private Integer id;
    private String name;

    public AuthorUpdateOutputDTO(AuthorEntity data) {
        this.id = data.getId();
        this.name = data.getName();
    }
}
