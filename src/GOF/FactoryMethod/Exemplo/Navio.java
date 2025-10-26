package GOF.FactoryMethod.Exemplo;

public class Navio implements ITransporte{
    @Override
    public void Entregar() {
        System.out.println("Entrega sendo feita pelo mar");
    }
}
