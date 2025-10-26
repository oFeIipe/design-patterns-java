package GOF.FactoryMethod.Exemplo;

public class LogisticaMaritima extends Logistica{
    @Override
    ITransporte criarTransporte() {
        return new Navio();
    }
}
