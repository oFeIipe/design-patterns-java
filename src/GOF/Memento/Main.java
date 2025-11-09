package GOF.Memento;

public class Main {
    public static void main(String[] args) {
        Personagem p = new Personagem(100, 50, 0);

        GerenciadorDoJogo gerenciadorDoJogo = new GerenciadorDoJogo();

        p.sofrerDano(20);

        System.out.println(p);

        gerenciadorDoJogo.salvarJogo(p);

        p.sofrerDano(100);

        gerenciadorDoJogo.carregarJogo(p);

        System.out.println(p);
    }
}
