package GOF.ChainOfResponsability;

public class ProcessadorCartaoCredito extends ProcessadorPagamento{


    @Override
    public void processar(Pagamento pagamento) {
        if(pagamento.metodo.equals("CARTAO")){
            System.out.println("Processando R$ " + pagamento.valor +
                    " via Cartão de Crédito");
        }
        else{
            repassarParaProximo(pagamento);
        }
    }
}
