package GOF.Interpreter;

public class Main {
    public static void main(String[] args) {
        ContextoUsuario contextoUsuario = new ContextoUsuario();

        IExpressaoPermissao regra1 = new ExpressaoE(
                new ExpressaoPermissaoSimples("ADMIN"),
                new ExpressaoNot(new ExpressaoPermissaoSimples("CONVIDADO")
                )
        );
        IExpressaoPermissao regra2 = new ExpressaoOu(
                new ExpressaoPermissaoSimples("GERENTE"),
                new ExpressaoPermissaoSimples("CONVIDADO")
        );

        System.out.println(regra1.interpreter(contextoUsuario));
        System.out.println(regra2.interpreter(contextoUsuario));
    }
}
