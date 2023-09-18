package com.github.guilhermewolke.estante.domain.publisher.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PublisherUpdateInputDTO {
    @NotNull
    private Integer id;

    @NotBlank
    @NotNull
    private String name;

}
