package com.pedroguths.dna2proteintranslator.service;

import com.pedroguths.dna2proteintranslator.model.GeneticCode;
import org.springframework.stereotype.Service;

@Service
public class DNAService {

    public String transcribe(String dna) {
        if (dna == null) return "";
        return dna.toUpperCase().replace('T', 'U');
    }

    public String translate(String rna) {
        StringBuilder protein = new StringBuilder();

        int startCodon = rna.indexOf("AUG");

        if (startCodon == -1) {
            return "No Start Codon (AUG) found";
        }

        for (int i = startCodon; i <= rna.length() - 3; i += 3) {
            String codon = rna.substring(i, i + 3);

            String aminoAcid = GeneticCode.getAminoAcid(codon);

            if ("STOP".equals(aminoAcid)) {
                break;
            }

            if (protein.length() > 0) {
                protein.append("-");
            }
            protein.append(aminoAcid);
        }

        return protein.toString();
    }
}