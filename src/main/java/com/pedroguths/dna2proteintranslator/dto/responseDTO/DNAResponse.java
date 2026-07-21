package com.pedroguths.dna2proteintranslator.dto.responseDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DNAResponse {
    private String rna;
    private String protein;
}
