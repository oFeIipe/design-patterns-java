package GOF.Decorator.Exemplo2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        IDataService simpleService = new SimpleDataService();

        System.out.println("--- Executando serviço simples ---");
        System.out.println(simpleService.fetchData("user1"));
        System.out.println(simpleService.fetchData("user1")); // Vai buscar no "DB" de novo

        System.out.println("\n--- Executando serviço com CACHE ---");
        // 2. "Empilhando" o Cache
        IDataService cachedService = new CachingDataDecorator(simpleService);
        System.out.println(cachedService.fetchData("user2")); // Lento (busca no DB)
        System.out.println(cachedService.fetchData("user2")); // Rápido (busca no Cache)

        System.out.println("\n--- Executando serviço com LOG + CACHE ---");
        // 3. "Empilhando" Log e Cache (a ordem importa!)
        //    Log -> Cache -> ServiçoSimples
        IDataService fullService = new LoggingDecorator(
                new CachingDataDecorator(
                        simpleService
                )
        );

        System.out.println(fullService.fetchData("user3")); // Lento (Log > Cache (miss) > DB > Cache (store) > Log)
        System.out.println(fullService.fetchData("user3")); // Rápido (Log > Cache (hit) > Log)
    }
}
