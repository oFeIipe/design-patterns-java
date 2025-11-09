package GOF.State;

public class Semaforo {
    private IEstadoSemaforo estadoAtual;

    public Semaforo(){
        this.estadoAtual = new EstadoVerde();
    }

    public void setEstado(IEstadoSemaforo novoEstado){
        this.estadoAtual = novoEstado;
    }

    public void timerEstorou(){
        this.estadoAtual.timerEstourou(this);
    }

    public void pedestreApertouOBotao(){
        this.estadoAtual.pedestreApertou(this);
    }
}
