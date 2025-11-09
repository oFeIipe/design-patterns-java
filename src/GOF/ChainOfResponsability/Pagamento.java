package GOF.ChainOfResponsability;

public class Pagamento {
    protected double valor;
    protected String metodo;

    public Pagamento(double valor, String metodo) {
        this.valor = valor;
        this.metodo = metodo;
    }
}
