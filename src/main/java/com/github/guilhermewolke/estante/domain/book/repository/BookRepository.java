package com.github.guilhermewolke.estante.domain.book.repository;

import com.github.guilhermewolke.estante.domain.book.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Integer> {
}
