package GOF.Proxy.Exemplo2;

public class ImageProxy implements IImage{
    private String fileName;
    private RealImage realImage = null;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage != null){
            realImage.display();
        }
        else{
            realImage = new RealImage(fileName);
        }
    }
}
