package GOF.Flyweight.Exemplo2;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static Map<String, ICharacterProperty> propertyPool = new HashMap<>();

    public static ICharacterProperty getProperty(char c, String fonte, int tamanho, String estilo){
        String key = c + "_" + fonte + "_" + tamanho + "_" + estilo;

        if(propertyPool.containsKey(key))
            return propertyPool.get(key);
        else
            propertyPool.put(key, new CharacterProperty(c, fonte, tamanho, estilo));
        return propertyPool.get(key);
    }
}
