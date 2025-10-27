package GOF.Builder;

public interface IRelatorioBuilder {
    void definirTitulo(String titulo);
    void definirCabecalho(String autor, String data);
    void adicionarConteudoCorpo(String paragrafo);
    void incluirTabelaDeConteudo();
    void definirRodape(String textoRodape);

    RelatorioDocumento build();
}
