package GOF.FactoryMethod.Exemplo;

public class LogisticaRodoviaria extends Logistica{

    @Override
    ITransporte criarTransporte() {
        return new Caminhao();
    }
}
