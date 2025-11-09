package GOF.State;

public class Main {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();

        semaforo.pedestreApertouOBotao();
        semaforo.timerEstorou();
        semaforo.timerEstorou();
        semaforo.pedestreApertouOBotao();
        semaforo.timerEstorou();
    }
}
