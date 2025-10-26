package GOF.FactoryMethod.Exemplo;

public class Main {
    public static void main(String[] args) {
        LogisticaRodoviaria logRod = new LogisticaRodoviaria();
        LogisticaMaritima logNav = new LogisticaMaritima();

        logRod.planejarEntrega();
        logNav.planejarEntrega();
    }
}
