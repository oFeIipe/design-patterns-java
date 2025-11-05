package GOF.Decorator.Exemplo2;

import java.util.HashMap;
import java.util.Map;

public class CachingDataDecorator extends DataServiceDecorator{
    Map<String, String> cache = new HashMap<>();

    public CachingDataDecorator(IDataService service) {
        super(service);
    }

    @Override
    public String fetchData(String key) throws InterruptedException{
        if(cache.containsKey(key)){
            System.out.println("(Retornando dados do CACHE)");
            return cache.get(key);
        }
        else {
            String data = super.fetchData(key);
            System.out.println("(Armazenando dados no CACHE)");
            Thread.sleep(2000);
            cache.put(key, data);

            return data;
        }
    }
}
