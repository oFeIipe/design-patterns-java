package GOF.Composite.Exemplo2;

public class Main {
    public static void main(String[] args) {
        IProduto teclado = new ProdutoSimples("Teclado", 150.00);
        IProduto mouse = new ProdutoSimples("Mouse", 89.90);
        IProduto monitor = new ProdutoSimples("Monitor", 900.00);


        CaixaBundle kitPerifericos = new CaixaBundle("Kit periféricos");

        kitPerifericos.adicionarProduto(teclado);
        kitPerifericos.adicionarProduto(mouse);

        CaixaBundle kitPC = new CaixaBundle("Kit PC Completo");

        kitPC.adicionarProduto(monitor);

        kitPC.adicionarProduto(kitPerifericos);

        double preco = kitPC.getPreco();
        
        System.out.println("O preço é: " + preco);
    }
}
