package GOF.AbstractFactory.Exemplo;

public class DBConfigReader implements IConfigReader {
    @Override
    public String readConfig(String key) {
        System.out.println("Lendo '" + key + "' do Banco de Dados Relacional.");
        // Lógica para ler do DB (SELECT...)
        return "valor_do_db_para_" + key;
    }
}