package GOF.AbstractFactory.Exemplo;

public class Main {
    public static void main(String[] args) {
        IConfigSourceFactory dbFactory = new DBConfigSourceFactory();
        ConfigurationManager dbManager = new ConfigurationManager(dbFactory);

        IConfigSourceFactory fileFactory = new FileConfigSourceFactory();
        ConfigurationManager fileManager = new ConfigurationManager(fileFactory);

        System.out.println("--- Usando Banco de Dados ---");
        dbManager.setSetting("timeout", "300");
        String dbTimeout = dbManager.getSetting("timeout");
        System.out.println("Valor lido (DB): " + dbTimeout);

        System.out.println("\n--- Usando Arquivo NoSQL ---");

        fileManager.setSetting("connectionString", "file://config.json");
        String fileConn = fileManager.getSetting("connectionString");
        System.out.println("Valor lido (Arquivo): " + fileConn);
    }
}
