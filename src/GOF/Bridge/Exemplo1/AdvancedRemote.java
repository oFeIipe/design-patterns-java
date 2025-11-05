package GOF.Bridge.Exemplo1;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device){
        super.device = device;
    }

    public void mute(){
        System.out.println("Remote: mute");
        this.device.setVolume(0);
    }
}
