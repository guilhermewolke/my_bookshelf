package com.github.guilhermewolke.estante.domain.publisher.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class OutputDTO {

    protected Integer id;
    protected String name;

}
