package GOF.ChainOfResponsability;

public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento cadeia = new ProcessadorCartaoCredito();
        cadeia.setNext(new ProcessadorPayPal())
                .setNext(new ProcessadorCripto());

        // 2. Enviar solicitações

        System.out.println("--- Tentando pagar com PayPal ---");
        Pagamento p1 = new Pagamento(150.00, "PAYPAL");
        cadeia.processar(p1); // O ProcessadorCartao vai pular, o PayPal vai tratar.

        System.out.println("\n--- Tentando pagar com Cripto ---");
        Pagamento p2 = new Pagamento(300.00, "CRIPTO");
        cadeia.processar(p2); // Cartao pula, PayPal pula, Cripto trata.

        System.out.println("\n--- Tentando pagar com Cartão ---");
        Pagamento p3 = new Pagamento(50.00, "CARTAO");
        cadeia.processar(p3); // Cartao trata.

        System.out.println("\n--- Tentando pagar com Pix (não configurado) ---");
        Pagamento p4 = new Pagamento(75.00, "PIX");
        cadeia.processar(p4); // Todos vão pular, o último vai dar a mensagem de erro.
    }
}
