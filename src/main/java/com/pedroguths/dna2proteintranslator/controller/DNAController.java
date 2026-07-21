package com.pedroguths.dna2proteintranslator.controller;

import com.pedroguths.dna2proteintranslator.dto.requestDTO.DNARequest;
import com.pedroguths.dna2proteintranslator.dto.responseDTO.DNAResponse;
import com.pedroguths.dna2proteintranslator.model.DNAModel;
import com.pedroguths.dna2proteintranslator.repository.DNARepository;
import com.pedroguths.dna2proteintranslator.service.DNAService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convert")
public class DNAController {

    private final DNAService dnaService;
    private final DNARepository dnaRepository;

    public DNAController(DNAService dnaService, DNARepository dnaRepository) {
        this.dnaService = dnaService;
        this.dnaRepository = dnaRepository;
    }

    @PostMapping
    public ResponseEntity<DNAResponse> convert(@RequestBody DNARequest request) {
        if (request.getDna() == null || request.getDna().isBlank()) {
            return ResponseEntity.badRequest().build();
        }

        String rna = dnaService.transcribe(request.getDna());
        String protein = dnaService.translate(rna);

        DNAResponse response = new DNAResponse(rna, protein);

        DNAModel dnaModel = new DNAModel();
        dnaModel.setDna(request.getDna());
        dnaModel.setRna(rna);
        dnaModel.setProtein(protein);
        dnaRepository.save(dnaModel);

        return ResponseEntity.ok(response);
    }
}
