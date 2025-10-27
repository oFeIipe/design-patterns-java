package GOF.AbstractFactory.Exemplo2;

public class CaixaDeSelecaoWindows implements ICaixaDeSelecao{
    @Override
    public void renderizar() {
        System.out.println("Renderizando uma caixa de seleção no Windows");
    }
}
