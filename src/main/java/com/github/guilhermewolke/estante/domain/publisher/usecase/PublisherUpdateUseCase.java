package com.github.guilhermewolke.estante.domain.publisher.usecase;

import com.github.guilhermewolke.estante.domain.publisher.dto.PublisherUpdateInputDTO;
import com.github.guilhermewolke.estante.domain.publisher.dto.PublisherUpdateOutputDTO;
import com.github.guilhermewolke.estante.domain.publisher.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublisherUpdateUseCase {
    @Autowired
    private PublisherService service;

    public PublisherUpdateOutputDTO execute(PublisherUpdateInputDTO input) {
        return this.service.update(input);
    }
}
