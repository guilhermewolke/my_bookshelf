package com.github.guilhermewolke.estante.domain.publisher.dto;

import com.github.guilhermewolke.estante.domain.publisher.entity.PublisherEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PublisherOutputDTO {
    private Integer id;
    private String name;

    public PublisherOutputDTO(PublisherEntity data) {
        this.id = data.getId();
        this.name = data.getName();
    }
}
