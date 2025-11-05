package GOF.Bridge.Exemplo2;

public abstract class Notification {
    protected IMessageSender sender;

    public Notification(){};

    public Notification(IMessageSender sender){
        this.sender = sender;
    }

    public abstract void notify(String subject, String body);
}
