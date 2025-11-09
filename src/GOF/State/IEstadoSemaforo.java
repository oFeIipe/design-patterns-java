package GOF.State;

public interface IEstadoSemaforo {
    void timerEstourou(Semaforo s);
    void pedestreApertou(Semaforo s);
}
