package DTPTProject.MainPackage.Service;

import DTPTProject.MainPackage.Model.GeneticCode;

/**
 * The TranslatorService class provides methods to transcribe DNA into RNA 
 * and translate RNA into proteins. It uses the genetic code table defined 
 * in the GeneticCode class to perform codon translation.
 * * @author Pedro Henrique Valente Guths
 */
public class TranslatorService {

    /**
     * Transcribes a DNA sequence into RNA by replacing thymine (T) 
     * with uracil (U).
     * * @param dna The DNA sequence string (e.g., "ATGC").
     * @return The resulting mRNA sequence string.
     */
    public String transcribe(String dna) {
        String cleanDna = dna.toUpperCase();
        return cleanDna.replace('T', 'U');
    }

    /**
     * Translates an mRNA sequence into a protein chain (sequence of amino acids).
     * The process reads the RNA in groups of three (codons) and stops 
     * if a STOP codon is encountered.
     * * @param rna The mRNA sequence string to be translated.
     * @return A string representing the protein chain with amino acids separated by hyphens.
     */
    public String translate(String rna) {
        StringBuilder protein = new StringBuilder();

        for (int i = 0; i <= rna.length() - 3; i += 3) {
            String codon = rna.substring(i, i + 3);

            // Retrieve the amino acid from the genetic code model
            String aminoAcid = GeneticCode.getAminoAcid(codon);

            // Termination logic for STOP codons
            if (aminoAcid.equals("STOP")) {
                break;
            }

            protein.append(aminoAcid).append("-");
        }

        String result = protein.toString();

        // Cleanup: removes the trailing hyphen if it exists
        if (result.endsWith("-")) {
            result = result.substring(0, result.length() - 1);
        }

        return result;
    }
}

