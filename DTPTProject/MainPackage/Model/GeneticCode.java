package DTPTProject.MainPackage.Model;

import java.util.HashMap;
import java.util.Map;

public class GeneticCode {

    private static Map<String, String> codonTable = new HashMap<>();

    static {

        codonTable.put("AUG", "Met");
        
        codonTable.put("UAA", "STOP");
        codonTable.put("UAG", "STOP");
        codonTable.put("UGA", "STOP");
        
        codonTable.put("UUU", "Phe");
        codonTable.put("UUC", "Phe");

        codonTable.put("UUA", "Leu");
        codonTable.put("UUG", "Leu");

        codonTable.put("GUU", "Val");
        codonTable.put("GUC", "Val");

        codonTable.put("GCU", "Ala");
        codonTable.put("GCC", "Ala");

    }

    public static String getAminoAcid(String codon) {
    return codonTable.getOrDefault(codon, "Inexistent Codon");
}
}
