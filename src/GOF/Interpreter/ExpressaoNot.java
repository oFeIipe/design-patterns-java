package GOF.Interpreter;

public class ExpressaoNot implements IExpressaoPermissao{
    public IExpressaoPermissao expressao;

    public ExpressaoNot(IExpressaoPermissao expressao){
        this.expressao = expressao;
    }

    @Override
    public boolean interpreter(ContextoUsuario contexto) {
        return !expressao.interpreter(contexto);
    }
}
