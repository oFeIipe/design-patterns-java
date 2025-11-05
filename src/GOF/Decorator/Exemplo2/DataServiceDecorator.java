package GOF.Decorator.Exemplo2;

public class DataServiceDecorator implements IDataService{

    protected IDataService wrappedService;

    public DataServiceDecorator(IDataService service){
        this.wrappedService = service;
    }

    @Override
    public String fetchData(String key) throws InterruptedException {
        return this.wrappedService.fetchData(key);
    }
}
