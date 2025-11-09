package GOF.Command;

public class ComandoDesligarLuz implements IComando{
    private Luz luz;

    public ComandoDesligarLuz(Luz luz) { this.luz = luz; };

    @Override
    public void executar() {
        luz.desligar();
    }
}
