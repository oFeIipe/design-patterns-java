package GOF.AbstractFactory.Exemplo2;

public class CaixaDeSelecaoLinux implements ICaixaDeSelecao{
    @Override
    public void renderizar() {
        System.out.println("Renderizando um botão no Linux");
    }
}
