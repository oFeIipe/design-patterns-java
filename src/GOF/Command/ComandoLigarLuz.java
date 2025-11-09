package GOF.Command;

public class ComandoLigarLuz implements IComando{

    private Luz luz;

    public ComandoLigarLuz(Luz luz) { this.luz = luz; };

    @Override
    public void executar() {
        luz.ligar();
    }
}
