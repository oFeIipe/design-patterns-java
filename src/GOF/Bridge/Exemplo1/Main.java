package GOF.Bridge.Exemplo1;

public class Main {
    public static void main(String[] args) {
        testDevice(new Radio());
        testDevice(new Tv());
    }

    public static void testDevice(Device device){
        System.out.println("Tests with basic remote");

        BasicRemote bRemote = new BasicRemote(device);
        bRemote.power();
        bRemote.channelUp();
        bRemote.volumeUp();

        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
