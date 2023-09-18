package com.github.guilhermewolke.estante.domain.publisher.usecase;

import com.github.guilhermewolke.estante.domain.publisher.dto.InputDTO;
import com.github.guilhermewolke.estante.domain.publisher.dto.OutputDTO;
import com.github.guilhermewolke.estante.domain.publisher.dto.PublisherFindByIDInputDTO;
import com.github.guilhermewolke.estante.domain.publisher.dto.PublisherOutputDTO;
import com.github.guilhermewolke.estante.domain.publisher.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublisherFindByIDUseCase {
    @Autowired
    private PublisherService service;

    public PublisherOutputDTO execute(PublisherFindByIDInputDTO input) {
        return this.service.findByID(input.getId());
    }
}
