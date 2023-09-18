package com.github.guilhermewolke.estante.domain.author.repository;

import com.github.guilhermewolke.estante.domain.author.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<AuthorEntity, Integer> {
}
