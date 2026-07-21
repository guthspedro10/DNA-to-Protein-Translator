package com.pedroguths.dna2proteintranslator.model;

import java.util.HashMap;
import java.util.Map;

public class GeneticCode {

    private static final Map<String, String> geneticCode = new HashMap<>();

    static {
        // Alanina (Ala)
        geneticCode.put("GCU", "Ala"); geneticCode.put("GCC", "Ala");
        geneticCode.put("GCA", "Ala"); geneticCode.put("GCG", "Ala");

        // Arginina (Arg)
        geneticCode.put("CGU", "Arg"); geneticCode.put("CGC", "Arg");
        geneticCode.put("CGA", "Arg"); geneticCode.put("CGG", "Arg");
        geneticCode.put("AGA", "Arg"); geneticCode.put("AGG", "Arg");

        // Asparagina (Asn)
        geneticCode.put("AAU", "Asn"); geneticCode.put("AAC", "Asn");

        // Ácido Aspártico (Asp)
        geneticCode.put("GAU", "Asp"); geneticCode.put("GAC", "Asp");

        // Cisteína (Cys)
        geneticCode.put("UGU", "Cys"); geneticCode.put("UGC", "Cys");

        // Glutamina (Gln)
        geneticCode.put("CAA", "Gln"); geneticCode.put("CAG", "Gln");

        // Ácido Glutâmico (Glu)
        geneticCode.put("GAA", "Glu"); geneticCode.put("GAG", "Glu");

        // Glicina (Gly)
        geneticCode.put("GGU", "Gly"); geneticCode.put("GGC", "Gly");
        geneticCode.put("GGA", "Gly"); geneticCode.put("GGG", "Gly");

        // Histidina (His)
        geneticCode.put("CAU", "His"); geneticCode.put("CAC", "His");

        // Isoleucina (Ile)
        geneticCode.put("AUU", "Ile"); geneticCode.put("AUC", "Ile"); geneticCode.put("AUA", "Ile");

        // Leucina (Leu)
        geneticCode.put("UUA", "Leu"); geneticCode.put("UUG", "Leu");
        geneticCode.put("CUU", "Leu"); geneticCode.put("CUC", "Leu");
        geneticCode.put("CUA", "Leu"); geneticCode.put("CUG", "Leu");

        // Lisina (Lys)
        geneticCode.put("AAA", "Lys"); geneticCode.put("AAG", "Lys");

        // Metionina / Start Codon (Met)
        geneticCode.put("AUG", "Met");

        // Fenilalanina (Phe)
        geneticCode.put("UUU", "Phe"); geneticCode.put("UUC", "Phe");

        // Prolina (Pro)
        geneticCode.put("CCU", "Pro"); geneticCode.put("CCC", "Pro");
        geneticCode.put("CCA", "Pro"); geneticCode.put("CCG", "Pro");

        // Serina (Ser)
        geneticCode.put("UCU", "Ser"); geneticCode.put("UCC", "Ser");
        geneticCode.put("UCA", "Ser"); geneticCode.put("UCG", "Ser");
        geneticCode.put("AGU", "Ser"); geneticCode.put("AGC", "Ser");

        // Treonina (Thr)
        geneticCode.put("ACU", "Thr"); geneticCode.put("ACC", "Thr");
        geneticCode.put("ACA", "Thr"); geneticCode.put("ACG", "Thr");

        // Triptofano (Trp)
        geneticCode.put("UGG", "Trp");

        // Tirosina (Tyr)
        geneticCode.put("UAU", "Tyr"); geneticCode.put("UAC", "Tyr");

        // Valina (Val)
        geneticCode.put("GUU", "Val"); geneticCode.put("GUC", "Val");
        geneticCode.put("GUA", "Val"); geneticCode.put("GUG", "Val");

        // Códons de Parada (STOP Codons)
        geneticCode.put("UAA", "STOP");
        geneticCode.put("UAG", "STOP");
        geneticCode.put("UGA", "STOP");
    }

    public static String getAminoAcid(String codon) {
        return geneticCode.getOrDefault(codon, "Inexistent Codon");
    }
}