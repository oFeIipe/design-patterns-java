package GOF.Flyweight.Exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DocumentCharacter> documento = new ArrayList<>();

        System.out.println("Digitando: HELLO WORLD");

        documento.add(new DocumentCharacter('H', "Arial", 12, "NEGRITO", 1, 1));
        documento.add(new DocumentCharacter('E', "Arial", 12, "NEGRITO", 1, 2));
        documento.add(new DocumentCharacter('L', "Arial", 12, "NEGRITO", 1, 3));
        documento.add(new DocumentCharacter('L', "Arial", 12, "NEGRITO", 1, 4));
        documento.add(new DocumentCharacter('O', "Arial", 12, "NEGRITO", 1, 5));

        documento.add(new DocumentCharacter(' ', "Arial", 12, "NEGRITO", 1, 6));

        documento.add(new DocumentCharacter('W', "Arial", 12, "NEGRITO", 1, 7));
        documento.add(new DocumentCharacter('O', "Arial", 12, "NEGRITO", 1, 8));
        documento.add(new DocumentCharacter('R', "Arial", 12, "NEGRITO", 1, 9));
        documento.add(new DocumentCharacter('L', "Arial", 12, "NEGRITO", 1, 10));
        documento.add(new DocumentCharacter('D', "Arial", 12, "NEGRITO", 1, 11));

        System.out.println("\n--- Anáilise na Memória");

        System.out.println("\n--- Renderizando Documento");
        for(DocumentCharacter dc: documento){
            dc.draw();
        }
    }
}
