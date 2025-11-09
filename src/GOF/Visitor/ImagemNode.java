package GOF.Visitor;

public class ImagemNode implements IDocumentNode{
    protected String urlImagem;

    public ImagemNode(String urlImagem) { this.urlImagem = urlImagem; }

    @Override
    public void accept(INodeVisitor v){
        v.visitar(this);
    }
}