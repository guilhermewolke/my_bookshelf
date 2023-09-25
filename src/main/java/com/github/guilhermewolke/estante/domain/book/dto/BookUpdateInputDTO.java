package com.github.guilhermewolke.estante.domain.book.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.guilhermewolke.estante.domain.book.entity.BookCategory;
import com.github.guilhermewolke.estante.domain.book.entity.BookFormat;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookUpdateInputDTO {
    @NotNull
    @Min(1)
    private Integer id;
    @JsonProperty("editora_id")
    private Integer publisherId;

    @JsonProperty("autores")
    private List<Integer> authors;

    @JsonProperty("titulo")
    private String title;

    @JsonProperty("categoria")
    private BookCategory category;

    @JsonProperty("comprado")
    private Boolean bought;

    @JsonProperty("isbn")
    private String ISBN;
    @JsonProperty("total_de_paginas")
    private Integer pages;
    @JsonProperty("formato")
    private BookFormat format;

}
