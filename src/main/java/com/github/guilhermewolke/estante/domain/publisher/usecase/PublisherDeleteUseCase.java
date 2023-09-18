package com.github.guilhermewolke.estante.domain.publisher.usecase;

import com.github.guilhermewolke.estante.domain.publisher.dto.PublisherDeleteInputDTO;
import com.github.guilhermewolke.estante.domain.publisher.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublisherDeleteUseCase {
    @Autowired
    private PublisherService service;

    public void execute(PublisherDeleteInputDTO input) {
        this.service.remove(input.getId());
    }
}
