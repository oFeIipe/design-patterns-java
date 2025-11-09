package GOF.Observer;

public class Main {
    public static void main(String[] args) {
        Produto mouse = new Produto("Mouse Gamer", 12);
        Produto teclado = new Produto("Teclado Gamer", 7);

        GerenciadorDeCompras gerenciadorDeCompras = new GerenciadorDeCompras();
        PainelDoUsuario painelDoUsuario = new PainelDoUsuario();

        registrarObserver(mouse, gerenciadorDeCompras);
        registrarObserver(mouse, painelDoUsuario);

        registrarObserver(teclado, gerenciadorDeCompras);
        registrarObserver(mouse, painelDoUsuario);

        mouse.setQuantidadeEmEstoque(3);
        teclado.setQuantidadeEmEstoque(3);
    }

    public static void registrarObserver(Produto produto, IObserverEstoque obs){
        produto.registrar(obs);
    }
}
