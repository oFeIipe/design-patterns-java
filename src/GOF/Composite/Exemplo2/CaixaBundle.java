package GOF.Composite.Exemplo2;

import java.util.ArrayList;
import java.util.List;

public class CaixaBundle implements IProduto{
    private String nome;
    List<IProduto> produtosFilhos = new ArrayList<>();

    CaixaBundle(String nome){
        this.nome = nome;
    }

    @Override
    public double getPreco() {
        double soma = 0;
        for(IProduto prod: produtosFilhos){
            System.out.println("O preco de " + prod.getNome() + " é " + prod.getPreco());
            double preco = prod.getPreco();
            soma += preco;
        }
        return soma;
    }

    @Override
    public String getNome(){
        return this.nome;
    }

    void adicionarProduto(IProduto produto){
        produtosFilhos.add(produto);
    }

    void removerProduto(IProduto produto){
        produtosFilhos.remove(produto);
    }


}
