package com.github.guilhermewolke.estante.domain.publisher.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class PublisherInsertInputDTO {
    @NotBlank
    private String name;
    public PublisherInsertInputDTO(String name) {
        this.name =  name;
    }

}
