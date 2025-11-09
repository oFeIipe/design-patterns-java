package GOF.Command;

public class ComandoAumentarTemp implements IComando{
    private ArCondicionado arCondicionado;
    private int temp;

    public ComandoAumentarTemp(ArCondicionado arCondicionado, int temp) {
        this.arCondicionado = arCondicionado;
        this.temp = temp;
    }

    @Override
    public void executar() {
        this.arCondicionado.aumentarTemperatura(temp);
    }
}
