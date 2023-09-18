package com.github.guilhermewolke.estante.domain.publisher.dto;

import com.github.guilhermewolke.estante.domain.publisher.entity.PublisherEntity;

public class PublisherInsertOutputDTO extends OutputDTO{
    public PublisherInsertOutputDTO(PublisherEntity data) {
        this.id = data.getId();
        this.name = data.getName();
    }
}
