package DTPTProject.MainPackage.Model;

import java.util.HashMap;
import java.util.Map;

public class GeneticCode {

    private static Map<String, String> codonTable = new HashMap<>();

    static {

        //Start Codon
        codonTable.put("AUG", "Metionina (Início)");
        
        //Stop Codons
        codonTable.put("UAA", "STOP");
        codonTable.put("UAG", "STOP");
        codonTable.put("UGA", "STOP");
        
        // Phenilalanina
        codonTable.put("UUU", "Phe");
        codonTable.put("UUC", "Phe");

        // Leucina
        codonTable.put("UUA", "Leu");
        codonTable.put("UUG", "Leu");

        // Valina
        codonTable.put("GUU", "Val");
        codonTable.put("GUC", "Val");

        // Alanina
        codonTable.put("GCU", "Ala");
        codonTable.put("GCC", "Ala");

    }

    public static String getAminoAcid(String codon) {
    return codonTable.getOrDefault(codon, "Inexistent Codon");
}
}
