package GOF.Observer;

public class GerenciadorDeCompras implements IObserverEstoque{

    @Override
    public void estoqueAtualizado(Produto produto) {
        if(produto.getQuantidadeEmEstoque() < 10){
            System.out.println("COMPRAS] Alerta: Estoque de " + produto.getNome() + " " +
                    "está baixo! Criando novo pedido.");
        }
    }
}
