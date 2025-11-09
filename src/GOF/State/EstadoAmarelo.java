package GOF.State;

public class EstadoAmarelo implements IEstadoSemaforo{

    @Override
    public void timerEstourou(Semaforo s) {
        System.out.println("Sinal Amarelo -> Vermelho");
        s.setEstado(new EstadoVermelho());
    }

    @Override
    public void pedestreApertou(Semaforo s) {
        System.out.println("Pedestre apertou... Aguardando");
    }
}