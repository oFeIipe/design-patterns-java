package GOF.Builder;

public class RelatorioTextoBuilder implements IRelatorioBuilder{

    private RelatorioDocumento relatorioDocumento;

    public RelatorioTextoBuilder(){
        this.relatorioDocumento = new RelatorioDocumento();
    }

    @Override
    public void definirTitulo(String titulo) {
        relatorioDocumento.titulo = titulo;
    }

    @Override
    public void definirCabecalho(String autor, String data) {
        relatorioDocumento.cabecalho = "Autor: " + autor + " data: " + data;
    }

    @Override
    public void adicionarConteudoCorpo(String paragrafo) {
        relatorioDocumento.corpo = paragrafo;
    }

    @Override
    public void incluirTabelaDeConteudo() {
        relatorioDocumento.gerarTabelaConteudo = true;
    }

    @Override
    public void definirRodape(String textoRodape) {
        relatorioDocumento.rodape = textoRodape;
    }

    @Override
    public RelatorioDocumento build() {
        return relatorioDocumento;
    }
}