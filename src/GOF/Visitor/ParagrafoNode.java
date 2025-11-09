package GOF.Visitor;

public class ParagrafoNode implements IDocumentNode{
    protected String texto;

    public ParagrafoNode(String texto) { this.texto = texto; }

    @Override
    public void accept(INodeVisitor v){
        v.visitar(this);
    }
}