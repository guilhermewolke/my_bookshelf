package com.github.guilhermewolke.estante.domain.publisher.controller;

import com.github.guilhermewolke.estante.domain.publisher.dto.*;
import com.github.guilhermewolke.estante.domain.publisher.usecase.PublisherUseCases;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/editoras")
public class PublisherController {
    @Autowired
    private PublisherUseCases useCases;

    @GetMapping
    public ResponseEntity<List<PublisherOutputDTO>> findAll() {
        List<PublisherOutputDTO> publishers = this.useCases.getListUseCase().execute();

        return ResponseEntity.ok(publishers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PublisherOutputDTO> findByID(@PathVariable Integer id) {
        PublisherFindByIDInputDTO input = new PublisherFindByIDInputDTO(id);

        return ResponseEntity.ok(this.useCases.getFindByIDUseCase().execute(input));
    }

    @PostMapping
    public ResponseEntity<PublisherInsertOutputDTO> create(@RequestBody @Valid PublisherInsertInputDTO data, UriComponentsBuilder uriBuilder) {
        System.out.println("Controller Name:" + data.getName());
        PublisherInsertOutputDTO output = this.useCases.getInsertUseCase().execute(data);
        var uri = uriBuilder.path("/editoras/{id}").buildAndExpand(output.getId()).toUri();
        return ResponseEntity.created(uri).body(output);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<OutputDTO> update(@PathVariable Integer id, @RequestBody @Valid PublisherUpdateInputDTO data) {
        OutputDTO output = this.useCases.getUpdateUseCase().execute(data);
        return ResponseEntity.ok(output);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity remove(@PathVariable Integer id) {
        PublisherDeleteInputDTO input = new PublisherDeleteInputDTO(id);
        this.useCases.getDeleteUseCase().execute(input);
        return ResponseEntity.noContent().build();
    }
}
