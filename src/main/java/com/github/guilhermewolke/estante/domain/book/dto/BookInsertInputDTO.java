package com.github.guilhermewolke.estante.domain.book.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.guilhermewolke.estante.domain.book.entity.BookCategory;
import com.github.guilhermewolke.estante.domain.book.entity.BookFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BookInsertInputDTO {
    @JsonProperty("editora_id")
    @NotNull
    private Integer publisherId;

    @JsonProperty("autores")
    @NotNull
    private List<Integer> authors;

    @NotNull
    @JsonProperty("titulo")
    private String title;

    @NotNull
    @JsonProperty("categoria")
    private BookCategory category;

    @NotNull
    @JsonProperty("comprado")
    private Boolean bought;

    @JsonProperty("isbn")
    private String ISBN;
    @JsonProperty("total_de_paginas")
    private Integer pages;
    @JsonProperty("formato")
    private BookFormat format;
}
