package GOF.Mediator;

public class Main {
    public static void main(String[] args) {
        ServidorChat servidor = new ServidorChat();

        Usuario user1 = new Usuario("Felipe", servidor);
        Usuario user2 = new Usuario("Fulano", servidor);
        Usuario user3 = new Usuario("Ciclano", servidor);
        Usuario user4 = new Usuario("Beltrano", servidor);

        user1.enviarMensagem("NU, vai tomando");
        user2.enviarMensagem("Receba ");
        user3.receberMensagem("NU, vai tomando", user1);

    }
}
