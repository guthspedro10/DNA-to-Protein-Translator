package DTPTProject.MainPackage;

import DTPTProject.MainPackage.Service.TranslatorService;

/**
 * Main application class to demonstrate DNA transcription and protein translation.
 * This class serves as the entry point for the genetic processing workflow.
 * * @author Pedro Henrique Valente Guths
 */
public class App {
    /**
     * The main method that starts the application.
     * * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {

        TranslatorService translator = new TranslatorService();

        // Sample DNA sequence for testing
        String myDna = "ATGGTTGCTTAA";

        // Processing the sequence through the central dogma steps
        String rna = translator.transcribe(myDna);
        String protein = translator.translate(rna);

        // Displaying results in the console
        System.out.println("Generated mRNA:  " + rna);
        System.out.println("Final Protein:   " + protein);
    }
}
