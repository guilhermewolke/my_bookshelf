package com.github.guilhermewolke.estante.domain.publisher.usecase;

import com.github.guilhermewolke.estante.domain.publisher.dto.OutputDTO;
import com.github.guilhermewolke.estante.domain.publisher.dto.PublisherOutputDTO;
import com.github.guilhermewolke.estante.domain.publisher.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherFindAllUseCase {
    @Autowired
    private PublisherService service;

    public List<PublisherOutputDTO> execute() {
        return this.service.list();
    }

}
