package com.github.guilhermewolke.estante.domain.author.dto;

import com.github.guilhermewolke.estante.domain.author.entity.AuthorEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorInsertOutputDTO {
    private Integer id;
    private String name;

    public AuthorInsertOutputDTO(AuthorEntity data) {
        this.id = data.getId();
        this.name = data.getName();
    }
}
