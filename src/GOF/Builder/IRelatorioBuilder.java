package GOF.Builder;

public interface IRelatorioBuilder {
    RelatorioTextoBuilder definirTitulo(String titulo);
    RelatorioTextoBuilder definirCabecalho(String autor, String data);
    RelatorioTextoBuilder adicionarConteudoCorpo(String paragrafo);
    RelatorioTextoBuilder incluirTabelaDeConteudo();
    RelatorioTextoBuilder definirRodape(String textoRodape);

    RelatorioDocumento build();
}
