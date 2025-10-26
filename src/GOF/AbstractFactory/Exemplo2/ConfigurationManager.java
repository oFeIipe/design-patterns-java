package GOF.AbstractFactory.Exemplo2;

public class ConfigurationManager {
    private IBotao botao;
    private ICaixaDeSelecao caixaDeSelecao;

    public ConfigurationManager(IGUIFactory factory){
        this.botao = factory.createBotao();
        this.caixaDeSelecao = factory.createCaixaDeSelecao();
    }

    public void montarTela(){
        botao.renderizar();
        caixaDeSelecao.renderizar();
    }

}
