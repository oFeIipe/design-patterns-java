package GOF.Singleton;

public class Singleton {
    private Singleton(){};
    private static Singleton instancia = null;

    public static synchronized Singleton getInstancia(){
        if(instancia == null)
            instancia = new Singleton();
        return instancia;
    }
}