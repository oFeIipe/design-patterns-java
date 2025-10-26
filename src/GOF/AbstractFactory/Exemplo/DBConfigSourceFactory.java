package GOF.AbstractFactory.Exemplo;

public class DBConfigSourceFactory implements IConfigSourceFactory{

    @Override
    public IConfigWriter createWriter() {
        return new DBConfigWriter();
    }

    @Override
    public IConfigReader createReader() {
        return new DBConfigReader();
    }
}
