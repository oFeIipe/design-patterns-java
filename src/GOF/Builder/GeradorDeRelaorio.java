package GOF.Builder;

public class GeradorDeRelaorio {
    public RelatorioDocumento gerarRelatorioDocumento(IRelatorioBuilder builder, String titulo, String autor, String data, String conteudo, String rodape) {
        builder.definirTitulo(titulo);
        builder.definirCabecalho(autor, data);
        builder.adicionarConteudoCorpo(conteudo);
        builder.definirRodape(rodape);
        return builder.build();
    }
}
