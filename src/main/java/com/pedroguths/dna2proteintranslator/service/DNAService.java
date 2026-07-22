package com.pedroguths.dna2proteintranslator.service;

import com.pedroguths.dna2proteintranslator.dto.responseDTO.DNAResponse;
import com.pedroguths.dna2proteintranslator.model.DNAModel;
import com.pedroguths.dna2proteintranslator.model.GeneticCode;
import com.pedroguths.dna2proteintranslator.repository.DNARepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class DNAService {

    private final DNARepository dnaRepository;

    public DNAService(DNARepository dnaRepository) {
        this.dnaRepository = dnaRepository;
    }

    @Transactional
    public DNAResponse convert(String dna) {

        String rna = transcribe(dna);
        String protein = translate(rna);

        DNAModel dnaModel = new DNAModel();
        dnaModel.setDna(dna);
        dnaModel.setRna(rna);
        dnaModel.setProtein(protein);
        dnaRepository.save(dnaModel);

        return new DNAResponse(rna, protein);
    }

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