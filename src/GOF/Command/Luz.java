package GOF.Command;

public class Luz {
    public String nome;

    public Luz(String nome) { this.nome = nome; };

    public void ligar(){
        System.out.println("Luz ligada");
    }

    public void desligar(){
        System.out.println("Luiz desligada");
    }
}
