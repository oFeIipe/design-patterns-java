package GOF.Interpreter;

public class ExpressaoOu implements IExpressaoPermissao{
    private IExpressaoPermissao esquerda, direita;

    public ExpressaoOu(IExpressaoPermissao direita,
                      IExpressaoPermissao esquerda){
        this.direita = direita;
        this.esquerda = esquerda;
    }

    @Override
    public boolean interpreter(ContextoUsuario contexto) {
        return esquerda.interpreter(contexto) ||
                direita.interpreter(contexto);
    }
}