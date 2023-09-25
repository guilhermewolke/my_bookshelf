package com.github.guilhermewolke.estante.domain.book.controller;

import com.github.guilhermewolke.estante.domain.author.dto.AuthorDeleteInputDTO;
import com.github.guilhermewolke.estante.domain.book.dto.*;
import com.github.guilhermewolke.estante.domain.book.usecase.BookUseCases;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class BookController {

    @Autowired
    private BookUseCases useCases;

    @GetMapping
    public ResponseEntity<Page<BookOutputDTO>> findAll(@PageableDefault(size=10, sort={"title"}) Pageable pagination) {
        var page = this.useCases.getFindAllUseCase().execute(pagination);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookOutputDTO> findByID(@PathVariable Integer id) {
        BookFindByIDInputDTO input = new BookFindByIDInputDTO(id);

        return ResponseEntity.ok(this.useCases.getFindByIDUseCase().execute(input));
    }

    @PostMapping
    @Transactional
    public ResponseEntity<BookInsertOutputDTO> create(@RequestBody @Valid BookInsertInputDTO data, UriComponentsBuilder uriBuilder) {
        BookInsertOutputDTO output = this.useCases.getInsertUseCase().execute(data);
        var uri = uriBuilder.path("/livros/{id}").buildAndExpand(output.getId()).toUri();
        return ResponseEntity.created(uri).body(output);
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<BookUpdateOutputDTO> update(@PathVariable Integer id, @RequestBody @Valid BookUpdateInputDTO data) {
        BookUpdateOutputDTO output = this.useCases.getUpdateUseCase().execute(data);
        return ResponseEntity.ok(output);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity remove(@PathVariable Integer id) {
        BookDeleteInputDTO input = new BookDeleteInputDTO(id);

        this.useCases.getDeleteUseCase().execute(input);
        return ResponseEntity.noContent().build();
    }
}
