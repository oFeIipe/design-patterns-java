package GOF.Observer;

public class PainelDoUsuario implements IObserverEstoque{

    @Override
    public void estoqueAtualizado(Produto produto) {
        System.out.println("[PAINEL] Estoque de " + produto.getNome() + " atualizado para: " + " " +
                produto.getQuantidadeEmEstoque());
    }
}
