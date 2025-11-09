package GOF.Visitor;

public interface IDocumentNode {
    void accept(INodeVisitor node);
}
