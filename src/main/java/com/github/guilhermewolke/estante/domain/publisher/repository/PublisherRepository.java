package com.github.guilhermewolke.estante.domain.publisher.repository;

import com.github.guilhermewolke.estante.domain.publisher.entity.PublisherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<PublisherEntity, Integer> {
}
