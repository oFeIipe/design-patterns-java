package GOF.AbstractFactory.Exemplo2;

public class LinuxFactory implements IGUIFactory{
    @Override
    public IBotao createBotao(){
        return new BotaoLinux();
    }

    @Override
    public ICaixaDeSelecao createCaixaDeSelecao() {
        return new CaixaDeSelecaoLinux();
    }
}
