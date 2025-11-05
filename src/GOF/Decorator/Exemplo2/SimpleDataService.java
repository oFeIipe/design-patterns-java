package GOF.Decorator.Exemplo2;

public class SimpleDataService implements IDataService{

    @Override
    public String fetchData(String key) throws InterruptedException {
        Thread.sleep(2000);
        return "Dados para " + key + " (Simulando busca lenta no DB...)";
    }
}
