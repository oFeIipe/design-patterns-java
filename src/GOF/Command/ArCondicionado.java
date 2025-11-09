package GOF.Command;

public class ArCondicionado {
    public String nome;

    public ArCondicionado(String nome) { this.nome = nome; };

    public void aumentarTemperatura(int graus){
        System.out.println("Temperatura aumentada para " + graus);

    }
}
