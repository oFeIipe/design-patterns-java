package GOF.Facade;

public class Main {
    public static void main(String[] args) {
        VideoConversionFacade conversor = new VideoConversionFacade();
        conversor.convertVideo("Ronaldo", "mp4");
    }
}
