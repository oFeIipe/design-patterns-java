package GOF.Mediator;

public interface IChatMediator {
    void adicionarUsuario(Usuario usuario);
    void enviarMensagem(String mensagem, Usuario usuario);
}
