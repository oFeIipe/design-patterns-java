package GOF.Memento;

public class Personagem {
    private int saude, mana, posicaoX;

    public Personagem(int saude, int mana, int posicaoX) {
        this.saude = saude;
        this.mana = mana;
        this.posicaoX = posicaoX;
    }

    public void sofrerDano(int dano){
        if(this.saude - dano > 0 && dano > 0 && this.saude > 0){
            this.saude -= dano;
        }
        else{
            System.out.println("VOCÊ MORREU!");
        }
    }

    public void andar(){
        this.posicaoX += 1;
    }

    public void recarregarMana(){
        this.mana += (int) (Math.random() * 10) + 1;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "saude=" + saude +
                ", mana=" + mana +
                ", posicaoX=" + posicaoX +
                '}';
    }

    public void restaurarCheckpoint(Checkpoint memento){
        System.out.println("Dados antes do ckeckpoint " + this);
        this.mana = memento.getMana();
        this.saude = memento.getSaude();
        this.posicaoX = memento.getX();
        System.out.println("Checkpoint feito, dados atuais " + this);
    }

    public Checkpoint criarCheckpoint(){
        return new Checkpoint(this.saude, this.mana, this.posicaoX);
    }
}
