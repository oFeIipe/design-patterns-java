package GOF.State;

public class EstadoVermelho implements IEstadoSemaforo{

    @Override
    public void timerEstourou(Semaforo s) {
        System.out.println("Sinal Vermelho -> Verde");
        s.setEstado(new EstadoVerde());
    }

    @Override
    public void pedestreApertou(Semaforo s) {
        System.out.println("Pedestre já pode atravessar");
    }
}
