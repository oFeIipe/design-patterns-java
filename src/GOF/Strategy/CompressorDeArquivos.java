package GOF.Strategy;

import java.util.List;

public class CompressorDeArquivos {
    private IStrategyCompressao estrategia;

    public CompressorDeArquivos(IStrategyCompressao estrategia) {
        this.estrategia = estrategia;
    }

    public void comprimirArquivos(List<String> arquivos){
        this.estrategia.comprimir(arquivos);
    }
}
