package GOF.Bridge.Exemplo2;

public class SimpleNotification extends Notification {

    public SimpleNotification(IMessageSender sender){
        super.sender = sender;
    }

    @Override
    public void notify(String subject, String body) {
        sender.sendMessage(subject, body);
    }
}
