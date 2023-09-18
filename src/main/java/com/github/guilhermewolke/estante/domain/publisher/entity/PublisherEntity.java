package com.github.guilhermewolke.estante.domain.publisher.entity;

import com.github.guilhermewolke.estante.domain.publisher.dto.PublisherInsertInputDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity(name="Publisher")
@Table(name="publisher")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode(of="id")
@ToString
public class PublisherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

}
