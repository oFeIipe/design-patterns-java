package GOF.Visitor;

public class TituloNode implements IDocumentNode{
    protected String titulo;

    public TituloNode(String titulo) { this.titulo = titulo; }

    @Override
    public void accept(INodeVisitor v){
        v.visitar(this);
    }
}
