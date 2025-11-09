package GOF.Memento;

public class Checkpoint {
    private final int saude, mana, x;

    public Checkpoint(int saude, int mana, int x) {
        this.saude = saude;
        this.mana = mana;
        this.x = x;
    }

    public int getSaude() {
        return saude;
    }

    public int getMana() {
        return mana;
    }

    public int getX() {
        return x;
    }
}
