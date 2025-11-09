package GOF.Interpreter;

public class ContextoUsuario {
    public boolean temPermissao(String permissao){
        return permissao.equals("ADMIN");
    }
}
