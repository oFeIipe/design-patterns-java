package GOF.Command;

public class ControleRemoto {
    private IComando comandoSlot1;

    public void programarBotao1(IComando comando){
        this.comandoSlot1 = comando;
    }

    public void apertarBotao1(){
        comandoSlot1.executar();
    }
}
