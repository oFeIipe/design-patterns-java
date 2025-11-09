package GOF.Interpreter;

public class ExpressaoPermissaoSimples implements IExpressaoPermissao{
    private String permissao;

    public ExpressaoPermissaoSimples(String permissao) { this.permissao = permissao; }

    @Override
    public boolean interpreter(ContextoUsuario contexto) {
        return contexto.temPermissao(this.permissao);
    }
}
