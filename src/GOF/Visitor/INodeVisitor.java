package GOF.Visitor;

public interface INodeVisitor {
    void visitar(TituloNode tituloNode);
    void visitar(ParagrafoNode paragrafoNode);
    void visitar(ImagemNode imagemNode);
}
