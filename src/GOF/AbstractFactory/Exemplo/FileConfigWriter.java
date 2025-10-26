package GOF.AbstractFactory.Exemplo;

public class FileConfigWriter implements IConfigWriter{

    @Override
    public void writeConfig(String key, String value) {
        System.out.println("Escrevendo '" + key + "=" + value + "' no Arquivo NoSQL.");
    }
}
