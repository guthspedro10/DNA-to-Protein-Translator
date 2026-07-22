package com.pedroguths.dna2proteintranslator.controller;

import com.pedroguths.dna2proteintranslator.dto.requestDTO.DNARequest;
import com.pedroguths.dna2proteintranslator.dto.responseDTO.DNAResponse;
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

    public DNAController(DNAService dnaService) {
        this.dnaService = dnaService;
    }

    @PostMapping
    public ResponseEntity<DNAResponse> convert(@RequestBody DNARequest request) {

        if (request.getDna() == null || request.getDna().isBlank()) {
            return ResponseEntity.badRequest().build();
        }

        DNAResponse response = dnaService.convert(request.getDna());

        return ResponseEntity.ok(response);
    }
}
