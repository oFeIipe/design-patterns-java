package GOF.Flyweight.Exemplo2;

public class DocumentCharacter {
    private int linha, coluna;

    private ICharacterProperty property;

    public DocumentCharacter(char c, String fonte, int tam, String est, int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
        this.property = CharacterFactory.getProperty(c, fonte, tam, est);
    }

    public void draw(){
        if(this.property != null)
            this.property.draw(this.linha, this.coluna);
    }
}
