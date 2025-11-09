package GOF.ChainOfResponsability;

public class ProcessadorCripto extends ProcessadorPagamento{

    @Override
    public void processar(Pagamento pagamento) {
        if(pagamento.metodo.equals("CRIPTO")){
            System.out.println("Processando R$ " + pagamento.valor +
                    " via Cripto");
        }
        else{
            repassarParaProximo(pagamento);
        }
    }
}
