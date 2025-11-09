package GOF.Visitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IDocumentNode> documentNodeList = List.of(
                new TituloNode("O Padrão Visitor"),
                new ParagrafoNode("Este padrão permite adicionar..."),
                new ImagemNode("http://example.com/visitor.png")
        );

        HtmlExportVisitor exportVisitor = new HtmlExportVisitor();

        for(IDocumentNode doc: documentNodeList){
            doc.accept(exportVisitor);
        }

        System.out.println("--- Documento HTML Gerado ---");
        System.out.println(exportVisitor.getHtml());
    }
}
