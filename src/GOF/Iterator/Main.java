package GOF.Iterator;

public class Main {
    public static void main(String[] args) {
        Album album = new Album();
        album.adicionarMusica(new Musica("Song C"));
        album.adicionarMusica(new Musica("Song A"));
        album.adicionarMusica(new Musica("Song B"));

        System.out.println("--- Iterando por Ordem Padrão ---");
        IIteradorMusica iteradorPadrao = album.criarIteradorPadrao();
        while (iteradorPadrao.hasNext()) {
            System.out.println(iteradorPadrao.next().nomeDaFaixa);
        }
        // Saída esperada: Song C, Song A, Song B

        System.out.println("\n--- Iterando por Ordem Alfabética ---");
        IIteradorMusica iteradorAlfabetico = album.criarIteradorAlfabetico();
        while (iteradorAlfabetico.hasNext()) {
            System.out.println(iteradorAlfabetico.next().nomeDaFaixa);
        }
        // Saída esperada: Song A, Song B, Song C
    }
}
