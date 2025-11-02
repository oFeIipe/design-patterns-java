package GOF.Builder;

public class RelatorioTextoBuilder implements IRelatorioBuilder{

    private RelatorioDocumento relatorioDocumento;

    public RelatorioTextoBuilder(){
        this.relatorioDocumento = new RelatorioDocumento();
    }

    @Override
    public RelatorioTextoBuilder definirTitulo(String titulo) {
        relatorioDocumento.titulo = titulo;
        return this;
    }

    @Override
    public RelatorioTextoBuilder definirCabecalho(String autor, String data) {
        relatorioDocumento.cabecalho = "Autor: " + autor + " data: " + data;
        return this;
    }

    @Override
    public RelatorioTextoBuilder adicionarConteudoCorpo(String paragrafo) {
        relatorioDocumento.corpo = paragrafo;
        return this;
    }

    @Override
    public RelatorioTextoBuilder incluirTabelaDeConteudo() {
        relatorioDocumento.gerarTabelaConteudo = true;
        return this;
    }

    @Override
    public RelatorioTextoBuilder definirRodape(String textoRodape) {
        relatorioDocumento.rodape = textoRodape;
        return this;
    }

    @Override
    public RelatorioDocumento build() {
        return relatorioDocumento;
    }
}