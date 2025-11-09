package GOF.State;

public class EstadoVerde implements IEstadoSemaforo{

    @Override
    public void timerEstourou(Semaforo s) {
        System.out.println("Sinal Verde -> Amarelo");
        s.setEstado(new EstadoAmarelo());
    }

    @Override
    public void pedestreApertou(Semaforo s) {
        System.out.println("Pedestre apertou... Aguardando");
    }
}
