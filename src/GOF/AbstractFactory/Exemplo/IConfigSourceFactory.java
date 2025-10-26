package GOF.AbstractFactory.Exemplo;

public interface IConfigSourceFactory {
    IConfigWriter createWriter();
    IConfigReader createReader();
}
