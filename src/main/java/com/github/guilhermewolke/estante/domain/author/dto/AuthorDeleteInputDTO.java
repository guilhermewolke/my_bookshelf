package com.github.guilhermewolke.estante.domain.author.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDeleteInputDTO {
    @NotBlank
    @Min(1)
    private Integer id;
}
