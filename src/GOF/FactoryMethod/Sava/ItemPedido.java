package GOF.FactoryMethod.Sava;
import java.util.*;

public class ItemPedido {
    private Produto produto;
    private int quantidade;
    private int precoUnitarioEmCentavos;

    public ItemPedido(Produto produto, int quantidade, int precoUnitarioEmCentavos) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitarioEmCentavos = precoUnitarioEmCentavos;
    }

    public Produto getProduto() {
        return produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public int getPrecoUnitarioEmCentavos() {
        return precoUnitarioEmCentavos;
    }

    public int valor() {
        return quantidade * precoUnitarioEmCentavos;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPrecoUnitarioEmCentavos(int precoUnitarioEmCentavos) {
        this.precoUnitarioEmCentavos = precoUnitarioEmCentavos;
    }

    /*public void removerItensInvalidos(ArrayList<ItemPedido> itens){
        ArrayIterator‹ItemPedido› cursor = new ArrayIterator(itens);
    }*/
}
