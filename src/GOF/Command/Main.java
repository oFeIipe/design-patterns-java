package GOF.Command;

public class Main {
    public static void main(String[] args) {
        Luz luz = new Luz("Cozinha");
        ArCondicionado arCondicionado = new ArCondicionado("Sala");

        ControleRemoto controle = new ControleRemoto();

        IComando ligarluz = new ComandoLigarLuz(luz);
        IComando desligarLuz = new ComandoDesligarLuz(luz);

        IComando aumentarTemp = new ComandoAumentarTemp(arCondicionado, 22);

        controle.programarBotao1(ligarluz);

        // 5. Simular o uso
        System.out.println("Apertando botão 1 (Ligar Luz):");
        controle.apertarBotao1(); // Deve imprimir "Luz da Cozinha Ligada"

        // 6. Reprogramar o mesmo botão
        controle.programarBotao1(aumentarTemp);

        System.out.println("\nApertando botão 1 (Aumentar Temp):");
        controle.apertarBotao1(); // Deve imprimir "Temperatura da Sala aumentada para 22 graus"
    }
}
