package GOF.Strategy;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arquivos = Arrays.asList("foto.jpg", "documento.pdf", "musica.mp3");

        ZipCompressaoStrategy zipCompressaoStrategy = new ZipCompressaoStrategy();
        CompressorDeArquivos zipCompressor = new CompressorDeArquivos(zipCompressaoStrategy);

        RarCompressaoStrategy rarCompressaoStrategy = new RarCompressaoStrategy();
        CompressorDeArquivos rarCompressor = new CompressorDeArquivos(rarCompressaoStrategy);

        zipCompressor.comprimirArquivos(arquivos);
        rarCompressor.comprimirArquivos(arquivos);
    }
}
