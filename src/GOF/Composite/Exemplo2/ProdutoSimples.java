package GOF.Composite.Exemplo2;

public class ProdutoSimples implements IProduto{
    private double preco;
    private String nome;

    ProdutoSimples(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco(){
        return preco;
    }

    @Override
    public String getNome(){
        return this.nome;
    }
}
