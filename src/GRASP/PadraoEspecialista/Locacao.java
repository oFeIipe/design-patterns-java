package GRASP.PadraoEspecialista;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Locacao {
    public Veiculo veiculo;
    public Cliente cliente;
    public LocalDate dataInicio;
    public LocalDate dataFim;

    public Locacao(Veiculo veiculo, Cliente cliente, LocalDate dataInicio, LocalDate dataFim) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dataFim = dataFim;
        this.dataInicio = dataInicio;
    }

    private long getDiferenca(){
        return this.dataInicio.until(this.dataFim, ChronoUnit.DAYS);
    }

    public float getPreco(){
        return this.veiculo.precoPorDia * getDiferenca();
    }
}
