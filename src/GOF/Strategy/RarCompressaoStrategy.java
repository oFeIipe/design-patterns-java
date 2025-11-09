package GOF.Strategy;

import java.util.List;

public class RarCompressaoStrategy implements IStrategyCompressao{
    @Override
    public void comprimir(List<String> arquivos) {
        for(String arquivo: arquivos){
            System.out.println("Comprimindo " + arquivo + " em RAR");
        }
    }
}