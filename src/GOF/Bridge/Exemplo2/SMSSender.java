package GOF.Bridge.Exemplo2;

public class SMSSender implements IMessageSender{
    @Override
    public void sendMessage(String subject, String body) {
        System.out.printf("Enviando SMS | Corpo: %s\n", body);
    }
}
