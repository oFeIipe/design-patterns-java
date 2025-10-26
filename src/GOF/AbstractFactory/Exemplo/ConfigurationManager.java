package GOF.AbstractFactory.Exemplo;

public class ConfigurationManager {
    private IConfigReader reader;
    private IConfigWriter writer;

    public ConfigurationManager(IConfigSourceFactory factory){
        this.reader = factory.createReader();
        this.writer = factory.createWriter();
    }

    public String getSetting(String key){
        return reader.readConfig(key);
    }

    public void setSetting(String key, String value){
        writer.writeConfig(key, value);
    }
}
