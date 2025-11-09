package GOF.Interpreter;

public class ExpressaoE implements IExpressaoPermissao{
    private IExpressaoPermissao esquerda, direita;

    public ExpressaoE(IExpressaoPermissao direita,
                      IExpressaoPermissao esquerda){
        this.direita = direita;
        this.esquerda = esquerda;
    }

    @Override
    public boolean interpreter(ContextoUsuario contexto) {
        return esquerda.interpreter(contexto) &&
                direita.interpreter(contexto);
    }
}