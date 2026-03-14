package DTPTProject.MainPackage.Model;

import java.util.HashMap;
import java.util.Map;

/**
 * The GeneticCode class is responsible for storing the genetic code table,
 * which maps RNA codons to their corresponding amino acids. It provides
 * a method to retrieve the amino acid associated with a specific codon.
 * * @author Pedro Henrique Valente Guths
 */
public class GeneticCode {

    /**
     * The genetic code table, where the key is the RNA codon (nucleotide triplet)
     * and the value is the corresponding amino acid. Stop codons are
     * mapped to "STOP".
     */
    private static final Map<String, String> codonTable = new HashMap<>();

    static {
        // Start Codon
        codonTable.put("AUG", "Met");

        // Stop Codons
        codonTable.put("UAA", "STOP");
        codonTable.put("UAG", "STOP");
        codonTable.put("UGA", "STOP");

        // Phenylalanine
        codonTable.put("UUU", "Phe");
        codonTable.put("UUC", "Phe");

        // Leucine
        codonTable.put("UUA", "Leu");
        codonTable.put("UUG", "Leu");

        // Valine
        codonTable.put("GUU", "Val");
        codonTable.put("GUC", "Val");

        // Alanine
        codonTable.put("GCU", "Ala");
        codonTable.put("GCC", "Ala");
    }

    /**
     * Retrieves the amino acid corresponding to an RNA codon.
     * If the codon is not present in the table, returns "Inexistent Codon".
     * * @param codon The three-letter RNA sequence (e.g., "AUG").
     * @return The name of the amino acid or "Inexistent Codon" if not found.
     */
    public static String getAminoAcid(String codon) {
        return codonTable.getOrDefault(codon, "Inexistent Codon");
    }
}

