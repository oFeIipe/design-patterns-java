package GOF.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ServidorChat implements IChatMediator{
    List<Usuario> usuarios;

    public ServidorChat() { this.usuarios = new ArrayList<>(); }

    @Override
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviarMensagem(String mensagem, Usuario remetente) {
        for(Usuario user: usuarios){
            if(user != remetente)
                user.enviarMensagem(mensagem);
            else{
                user.receberMensagem(mensagem, remetente);
            }
        }
    }
}