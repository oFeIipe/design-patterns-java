package GOF.Iterator;

import java.util.List;

public class IteradorOrdemPadrao implements IIteradorMusica{

    List<Musica> musicas;
    int posicao = 0;

    public IteradorOrdemPadrao(List<Musica> musicas){
        this.musicas = musicas;
    }

    @Override
    public boolean hasNext() {
        return posicao < musicas.size() && musicas.get(posicao) != null;
    }

    @Override
    public Musica next() {
        return musicas.get(posicao++);
    }
}
