package GOF.ChainOfResponsability;

public abstract class ProcessadorPagamento {
    protected ProcessadorPagamento proximoProcessador;


    public abstract void processar(Pagamento pagamento);

    public ProcessadorPagamento setNext(ProcessadorPagamento proximo){
        this.proximoProcessador = proximo;
        return proximo;
    }

    protected void repassarParaProximo(Pagamento pagamento){
        if(proximoProcessador != null){
            proximoProcessador.processar(pagamento);
        }
        else{
            System.out.println("ERRO: Nenhum processador disponível para o método: " + pagamento.metodo);
        }
    }
}
