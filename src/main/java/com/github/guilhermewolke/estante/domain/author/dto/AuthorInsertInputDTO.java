package com.github.guilhermewolke.estante.domain.author.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorInsertInputDTO {
    @NotBlank
    @NotNull
    private String name;
}
