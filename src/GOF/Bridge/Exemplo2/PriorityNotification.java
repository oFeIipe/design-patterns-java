package GOF.Bridge.Exemplo2;

public class PriorityNotification extends Notification{

    public PriorityNotification(IMessageSender sender){
        super.sender = sender;
    }

    @Override
    public void notify(String subject, String body) {
        sender.sendMessage("[URGENTE] " + subject, body);
    }
}
