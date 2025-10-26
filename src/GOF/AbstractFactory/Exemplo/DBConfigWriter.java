package GOF.AbstractFactory.Exemplo;

public class DBConfigWriter implements IConfigWriter{

    @Override
    public void writeConfig(String key, String value) {
        System.out.println("Escrevendo '" + key + "=" + value + "' no Banco de Dados Relacional.");
    }
}
