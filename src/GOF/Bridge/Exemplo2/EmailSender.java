package GOF.Bridge.Exemplo2;

public class EmailSender implements IMessageSender{

    @Override
    public void sendMessage(String subject, String body) {
        System.out.printf("Enviando E-MAIL | Assunto: %s | Corpo: %s\n", subject, body);
    }
}
