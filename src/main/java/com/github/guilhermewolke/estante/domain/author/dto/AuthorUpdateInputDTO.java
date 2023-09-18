package com.github.guilhermewolke.estante.domain.author.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AuthorUpdateInputDTO {
    @NotNull
    @Min(1)
    private Integer id;
    @NotNull
    @NotBlank
    private String name;
}
