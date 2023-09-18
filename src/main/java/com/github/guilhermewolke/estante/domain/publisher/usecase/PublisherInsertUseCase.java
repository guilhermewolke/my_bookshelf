package com.github.guilhermewolke.estante.domain.publisher.usecase;

import com.github.guilhermewolke.estante.domain.publisher.dto.PublisherInsertInputDTO;
import com.github.guilhermewolke.estante.domain.publisher.dto.PublisherInsertOutputDTO;
import com.github.guilhermewolke.estante.domain.publisher.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublisherInsertUseCase {
    @Autowired
    private PublisherService service;

    public PublisherInsertOutputDTO execute(PublisherInsertInputDTO input) {
        System.out.println("Usecase Name:" + input.getName());
        return this.service.create(input);
    }
}
