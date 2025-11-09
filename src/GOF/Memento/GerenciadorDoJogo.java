package GOF.Memento;

public class GerenciadorDoJogo {
    private Checkpoint saveAtivo;

    public void salvarJogo(Personagem p){
        this.saveAtivo = p.criarCheckpoint();
    }

    public void carregarJogo(Personagem p){
        if(saveAtivo != null){
            p.restaurarCheckpoint(saveAtivo);
        }
    }
}
