package GOF.AbstractFactory.Exemplo2;

public class BotaoWindows implements IBotao{

    @Override
    public void renderizar() {
        System.out.println("Renderizando um botão no Windows");
    }
}
