package GOF.Builder;

public class Main {
    public static void main(String[] args) {
        RelatorioTextoBuilder builder = new RelatorioTextoBuilder();

        GeradorDeRelaorio gerador = new GeradorDeRelaorio();

        RelatorioDocumento gerado = gerador.gerarRelatorioDocumento(builder,
                "Documento title", "Felipe Autor", "lorem", "lorem", "fim");

        gerado.exibir();
    }
}
