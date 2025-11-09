package GOF.Visitor;

public class HtmlExportVisitor implements INodeVisitor{

    StringBuilder htmlResultado = new StringBuilder();

    @Override
    public void visitar(TituloNode node) {
        htmlResultado.append("<h1>").append(node.titulo).append("</h1>\\n\"");
    }

    @Override
    public void visitar(ParagrafoNode node) {
        htmlResultado.append("<p>").append(node.texto).append("</p>\\n\"");
    }

    @Override
    public void visitar(ImagemNode node) {
        htmlResultado.append("<img src='").append(node.urlImagem).append("' />\\n\"");
    }

    public String getHtml(){
        return htmlResultado.toString();
    }
}
