package GOF.AbstractFactory.Exemplo2;

public class WindowsFactory implements IGUIFactory{
    @Override
    public IBotao createBotao(){
        return new BotaoWindows();
    }

    @Override
    public ICaixaDeSelecao createCaixaDeSelecao() {
        return new CaixaDeSelecaoWindows();
    }
}
