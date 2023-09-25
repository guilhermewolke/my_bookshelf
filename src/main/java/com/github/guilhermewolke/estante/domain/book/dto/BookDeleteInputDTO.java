package com.github.guilhermewolke.estante.domain.book.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BookDeleteInputDTO {
    @NotBlank
    @Min(1)
    private Integer id;
}
