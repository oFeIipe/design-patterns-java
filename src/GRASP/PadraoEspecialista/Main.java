package GRASP.PadraoEspecialista;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Felipe", "12234454");
        Veiculo veiculo = new Veiculo("BYD", 160);

        LocalDate dataInicio = LocalDate.now();
        LocalDate dataFim = LocalDate.now().plusDays(7);

        Locacao locacao = new Locacao(veiculo, cliente, dataInicio, dataFim);

        System.out.println(locacao.getPreco());
    }
}
