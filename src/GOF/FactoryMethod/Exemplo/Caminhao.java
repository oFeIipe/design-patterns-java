package GOF.FactoryMethod.Exemplo;

public class Caminhao implements ITransporte{
    @Override
    public void Entregar(){
        System.out.println("Entrega sendo feita por terra");
    }
}
