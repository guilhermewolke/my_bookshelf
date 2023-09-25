package com.github.guilhermewolke.estante.domain.book.entity;

public enum BookFormat {
    IMPRESSO("Impresso"),
    EBOOK("E-book");

    public final String label;

    private BookFormat(String label) {
        this.label = label;
    }
}
