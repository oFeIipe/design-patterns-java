package GOF.AbstractFactory.Exemplo;

public class FileConfigReader implements IConfigReader{

    @Override
    public String readConfig(String key) {
        System.out.println("Lendo: " + " do Arquivo NoSQL");

        return "valor_do_arquivo_para_" + key;
    }
}
