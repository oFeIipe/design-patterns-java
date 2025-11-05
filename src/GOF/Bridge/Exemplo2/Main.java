package GOF.Bridge.Exemplo2;

public class Main {
    public static void main(String[] args) {
        SMSSender smsSender = new SMSSender();
        EmailSender emailSender = new EmailSender();
        PushSender pushSender = new PushSender();

        testNotification(smsSender);
        testNotification(emailSender);
        testNotification(pushSender);
    }

    public static void testNotification(IMessageSender sender){
        SimpleNotification simpleNotification = new SimpleNotification(sender);
        PriorityNotification priorityNotification = new PriorityNotification(sender);

        simpleNotification.notify("Título", "Lorem ipsum dolor sit amet");
        priorityNotification.notify("Título", "Lorem ipsum dolor sit amet");
    }
}
