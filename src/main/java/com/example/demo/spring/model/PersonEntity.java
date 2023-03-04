package com.example.demo.spring.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "people")
@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;
}
