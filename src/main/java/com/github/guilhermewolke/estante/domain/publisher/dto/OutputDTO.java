package com.github.guilhermewolke.estante.domain.publisher.dto;

public abstract class OutputDTO {

    protected Integer id;
    protected String name;
    public Integer getID() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
}
