package com.pedroguths.dna2proteintranslator.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "dna2protein")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DNAModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String dna;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String rna;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String protein;
}
