package GOF.Bridge.Exemplo2;

public class PushSender implements IMessageSender{
    @Override
    public void sendMessage(String subject, String body) {
        System.out.printf("Enviando PUSH | Título: %s | Corpo: %s\n", subject, body);
    }
}
