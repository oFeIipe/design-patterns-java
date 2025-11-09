package GOF.Flyweight.Exemplo2;

public class CharacterProperty implements ICharacterProperty{
    private final char caractere;
    private final String fonte;
    private final int tamanho;
    private final String estilo;

    public CharacterProperty(char caractere, String fonte, int tamanho, String estilo) {
        this.caractere = caractere;
        this.fonte = fonte;
        this.tamanho = tamanho;
        this.estilo = estilo;
        System.out.println("CRIANDO flyweight para: " + caractere + " (" + fonte + ")");
    }


    @Override
    public void draw(int linha, int coluna){
        System.out.println("Desenhando '" + caractere + "' na [" + linha + "," + coluna
        + "]");
    }


}
