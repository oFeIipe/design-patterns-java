package GOF.Builder;

public class RelatorioDocumento {
    String titulo;
    String cabecalho;
    String corpo;
    boolean gerarTabelaConteudo;
    String rodape;

    public void exibir(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Cabeçalho: " + this.cabecalho);
        System.out.println("Corpo: " + this.corpo);
        System.out.println("Gerar tabela conteúdo: " + this.gerarTabelaConteudo);
        System.out.println("Rodapé: " + this.rodape);
    }

}
