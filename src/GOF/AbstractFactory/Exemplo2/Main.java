package GOF.AbstractFactory.Exemplo2;

public class Main {
    public static void main(String[] args) {
        IGUIFactory wFactory = new WindowsFactory();
        ConfigurationManager wManager = new ConfigurationManager(wFactory);

        IGUIFactory lFactory = new LinuxFactory();
        ConfigurationManager lManager = new ConfigurationManager(lFactory);

        wManager.montarTela();

        lManager.montarTela();
    }
}
