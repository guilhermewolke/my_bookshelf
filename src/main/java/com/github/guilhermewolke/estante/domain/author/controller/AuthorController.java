package com.github.guilhermewolke.estante.domain.author.controller;

import com.github.guilhermewolke.estante.domain.author.dto.*;
import com.github.guilhermewolke.estante.domain.author.usecase.AuthorUseCases;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AuthorController {
    @Autowired
    private AuthorUseCases useCases;

    @GetMapping
    public ResponseEntity<List<AuthorOutputDTO>> findAll() {
        List<AuthorOutputDTO> Authors = this.useCases.getListUseCase().execute();

        return ResponseEntity.ok(Authors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuthorOutputDTO> findByID(@PathVariable Integer id) {
        AuthorFindByIDInputDTO input = new AuthorFindByIDInputDTO(id);

        return ResponseEntity.ok(this.useCases.getFindByIDUseCase().execute(input));
    }

    @PostMapping
    public ResponseEntity<AuthorInsertOutputDTO> create(@RequestBody @Valid AuthorInsertInputDTO data, UriComponentsBuilder uriBuilder) {
        System.out.println("Controller Name:" + data.getName());
        AuthorInsertOutputDTO output = this.useCases.getInsertUseCase().execute(data);
        var uri = uriBuilder.path("/autores/{id}").buildAndExpand(output.getId()).toUri();
        return ResponseEntity.created(uri).body(output);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<AuthorUpdateOutputDTO> update(@PathVariable Integer id, @RequestBody @Valid AuthorUpdateInputDTO data) {
        AuthorUpdateOutputDTO output = this.useCases.getUpdateUseCase().execute(data);
        return ResponseEntity.ok(output);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity remove(@PathVariable Integer id) {
        AuthorDeleteInputDTO input = new AuthorDeleteInputDTO(id);
        this.useCases.getDeleteUseCase().execute(input);
        return ResponseEntity.noContent().build();
    }
}
