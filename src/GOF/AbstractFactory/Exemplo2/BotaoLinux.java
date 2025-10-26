package GOF.AbstractFactory.Exemplo2;

public class BotaoLinux implements IBotao{

    @Override
    public void renderizar() {
        System.out.println("renderizando um botão no Linux");
    }
}
