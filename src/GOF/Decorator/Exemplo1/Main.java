package GOF.Decorator.Exemplo1;

public class Main {
    public static void main(String[] args) {
        FileDataSource fileDataSource = new FileDataSource("As aventuras de cleitin");


        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        fileDataSource
                )
        );

        encoded.writeData("Momento Ronaldo");
        System.out.println(encoded.readData());
    }
}
