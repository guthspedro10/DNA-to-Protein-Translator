package DTPTProject.MainPackage.Service;

public class TranslatorService {

    public String transcrever(String dna) {
        String dnaLimpo = dna.toUpperCase();
        return dnaLimpo.replace('T', 'U');
    }

    public String traduzir(String rna) {
        StringBuilder proteina = new StringBuilder();

        for (int i = 0; i <= rna.length() - 3; i += 3) {
            String codon = rna.substring(i, i + 3);

            String aminoacido = DTPTProject.MainPackage.Model.GeneticCode.getAminoAcid(codon);

            if (aminoacido.equals("STOP")) {
                break;
            }

            proteina.append(aminoacido).append("-");
        }

        String resultado = proteina.toString();

        if (resultado.endsWith("-")) {
            resultado = resultado.substring(0, resultado.length() - 1);
        }

        return resultado;
    }
}
