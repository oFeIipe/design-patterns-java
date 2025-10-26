package GOF.FactoryMethod.Exemplo;

public abstract class Logistica {
    abstract ITransporte criarTransporte();

    public void planejarEntrega(){
        ITransporte transporte = criarTransporte();

        transporte.Entregar();
    }
}
