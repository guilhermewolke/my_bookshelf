package com.github.guilhermewolke.estante.domain.publisher.usecase;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Getter
@Service
public class PublisherUseCases {

    @Autowired
    private PublisherFindAllUseCase listUseCase;
    @Autowired
    private PublisherDeleteUseCase deleteUseCase;

    @Autowired
    private PublisherFindByIDUseCase findByIDUseCase;

    @Autowired
    private PublisherInsertUseCase insertUseCase;

    @Autowired
    private PublisherUpdateUseCase updateUseCase;
}
