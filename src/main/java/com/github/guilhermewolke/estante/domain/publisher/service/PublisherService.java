package com.github.guilhermewolke.estante.domain.publisher.service;

import com.github.guilhermewolke.estante.domain.publisher.dto.*;
import com.github.guilhermewolke.estante.domain.publisher.entity.PublisherEntity;
import com.github.guilhermewolke.estante.domain.publisher.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PublisherService {
    @Autowired
    private PublisherRepository repository;

    public PublisherInsertOutputDTO create(PublisherInsertInputDTO data) {
        System.out.println("Service Name: " + data.getName());
        PublisherEntity entity = new PublisherEntity(null, data.getName());
        this.repository.save(entity);
        return new PublisherInsertOutputDTO(entity);
    }

    public List<PublisherOutputDTO> list() {
        List<PublisherOutputDTO> list = new ArrayList<>();

        List<PublisherEntity> publishers = this.repository.findAll();

        publishers.forEach(p -> list.add(new PublisherOutputDTO(p)));
        return list;
    }

    public PublisherOutputDTO findByID(Integer id) {
        PublisherEntity publisher = this.repository.getReferenceById(id);
        return new PublisherOutputDTO(publisher);
    }

    public PublisherUpdateOutputDTO update(PublisherUpdateInputDTO data) {
        PublisherEntity updated = new PublisherEntity(data.getId(), data.getName());
        this.repository.save(updated);
        return new PublisherUpdateOutputDTO(updated);
    }

    public void remove(Integer id) {
        PublisherEntity publisher = this.repository.getReferenceById(id);
        this.repository.delete(publisher);
    }
}
