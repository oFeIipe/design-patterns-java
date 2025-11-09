package GOF.Observer;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private List<IObserverEstoque> observadores = new ArrayList<>();
    private String nome;
    private int quantidadeEmEstoque;

    public Produto(String nome, int quantidadeEmEstoque) {
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }


    public void registrar(IObserverEstoque obs){
        observadores.add(obs);
    }

    public void remover(IObserverEstoque obs){
        observadores.remove(obs);
    }

    private void notificarObservadores(){
        for(IObserverEstoque obs: observadores){
            obs.estoqueAtualizado(this);
        }
    }

    public void setQuantidadeEmEstoque(int novaQuantidade){
        this.quantidadeEmEstoque = novaQuantidade;
        notificarObservadores();
    }



    public int getQuantidadeEmEstoque(){
        return this.quantidadeEmEstoque;
    }

    public String getNome(){
        return this.nome;
    }
}
