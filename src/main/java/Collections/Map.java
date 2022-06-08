package Collections;

import java.util.Collection;
import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        java.util.Map<String, String> hashMap = new HashMap<>();
            hashMap.put("nome1", "Gabriel");
            hashMap.put("nome2", "Giulia");
        Collection<String> valores = hashMap.values();
            for(String valor: valores){
                System.out.println("Valor: "+ valor);
            }
    }
}
