package GOF.ChainOfResponsability;

public class ProcessadorPix extends ProcessadorPagamento{


    @Override
    public void processar(Pagamento pagamento) {
        if(pagamento.metodo.equals("PIX")){
            System.out.println("Processando R$ " + pagamento.valor +
                    " no Pix");
        }
        else{
            repassarParaProximo(pagamento);
        }
    }
}
