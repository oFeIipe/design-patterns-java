package GOF.Decorator.Exemplo2;

public class LoggingDecorator extends DataServiceDecorator{

    public LoggingDecorator(IDataService service) {
        super(service);
    }

    @Override
    public String fetchData(String key) throws InterruptedException{
        System.out.println("[LOG] Iniciando busca para a chave: " + key);
        Thread.sleep(2000);
        System.out.println("\"[LOG] Busca finalizada para a chave: \" + key");
        return super.fetchData(key);
    }
}
