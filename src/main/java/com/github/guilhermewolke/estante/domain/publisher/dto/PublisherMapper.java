package com.github.guilhermewolke.estante.domain.publisher.dto;

import com.github.guilhermewolke.estante.domain.author.dto.AuthorOutputDTO;
import com.github.guilhermewolke.estante.domain.author.entity.AuthorEntity;
import com.github.guilhermewolke.estante.domain.publisher.entity.PublisherEntity;

import java.util.ArrayList;
import java.util.List;

public class PublisherMapper {

    public static List<PublisherOutputDTO> fromEntityList(List<PublisherEntity> publishers) {
        List<PublisherOutputDTO> list = new ArrayList<PublisherOutputDTO>();

        publishers.forEach(publisher -> list.add(new PublisherOutputDTO(publisher)));
        return list;
    }

    public static PublisherOutputDTO fromEntity(PublisherEntity author) {
        return new PublisherOutputDTO(author);
    }
}
