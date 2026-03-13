package DTPTProject.MainPackage;

import DTPTProject.MainPackage.Service.TranslatorService;

public class App {
    public static void main(String[] args) {
        
        TranslatorService tradutor = new TranslatorService();
        
        String meuDna = "ATGGTTGCTTAA"; 
        
        String rna = tradutor.transcrever(meuDna);
        String proteina = tradutor.traduzir(rna);
        
        System.out.println("mRNA Gerado:   " + rna);
        System.out.println("Proteína Final: " + proteina);
    }
}
