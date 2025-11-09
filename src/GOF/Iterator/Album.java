package GOF.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Album {
    List<Musica> faixas;

    public Album(){
        this.faixas = new ArrayList<>();
    }

    public void adicionarMusica(Musica m){
        faixas.add(m);
    }

    public IIteradorMusica criarIteradorPadrao(){
        return new IteradorOrdemPadrao(faixas);
    }

    public IIteradorMusica criarIteradorAlfabetico(){
        return new IteradorOrdemAlfabetica(faixas);
    }
}
