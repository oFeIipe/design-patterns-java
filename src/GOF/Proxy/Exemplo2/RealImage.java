package GOF.Proxy.Exemplo2;

public class RealImage implements IImage{
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        this.loadFromDisk(this.fileName);
    }

    public void loadFromDisk(String fileName){
        System.out.println("CARREGANDO (2s)... " + fileName);
        try{
            Thread.sleep(2000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println("CARREGAMENTO CONCLUÍDO");
    }

    @Override public void display() {
        System.out.println("EXIBINDO: " + fileName);
    }
}
