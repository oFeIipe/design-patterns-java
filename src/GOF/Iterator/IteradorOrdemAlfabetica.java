package GOF.Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IteradorOrdemAlfabetica implements IIteradorMusica{
    List<Musica> copia;
    int posicao = 0;

    public IteradorOrdemAlfabetica(List<Musica> musicas){
        this.copia = new ArrayList<>(musicas);

        Collections.sort(this.copia, new Comparator<Musica>() {
            @Override
            public int compare(Musica o1, Musica o2) {
                return o1.nomeDaFaixa.compareTo(o2.nomeDaFaixa);
            }
        });
    }

    @Override
    public boolean hasNext() {
        return posicao < copia.size() && copia.get(posicao) != null;
    }

    @Override
    public Musica next() {
        return copia.get(posicao++);
    }


}
