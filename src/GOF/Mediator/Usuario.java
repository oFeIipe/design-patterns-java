package GOF.Mediator;

public class Usuario {
    protected String nome;
    protected IChatMediator mediator;

    public Usuario(String nome, IChatMediator mediator){
        this.nome = nome;
        this.mediator = mediator;
    }

    public void enviarMensagem(String mensagem){
        System.out.println(this.nome + " envia: " + mensagem);
        mediator.enviarMensagem(mensagem, this);
    }

    public void receberMensagem(String mensagem, Usuario remetente){
        System.out.println("[Tela de " + this.nome + "] " + remetente.nome + " disse: " + mensagem);
    }
}
