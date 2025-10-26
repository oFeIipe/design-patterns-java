package GOF.AbstractFactory.Exemplo;

public class FileConfigSourceFactory implements IConfigSourceFactory{

    @Override
    public IConfigWriter createWriter() {
        return new FileConfigWriter();
    }

    @Override
    public IConfigReader createReader() {
        return new FileConfigReader();
    }
}
