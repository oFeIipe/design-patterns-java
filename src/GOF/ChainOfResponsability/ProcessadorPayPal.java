package GOF.ChainOfResponsability;

public class ProcessadorPayPal extends ProcessadorPagamento{


    @Override
    public void processar(Pagamento pagamento) {
        if(pagamento.metodo.equals("PAYPAL")){
            System.out.println("Processando R$ " + pagamento.valor +
                    " via Pay Pal");
        }
        else{
            repassarParaProximo(pagamento);
        }
    }
}
