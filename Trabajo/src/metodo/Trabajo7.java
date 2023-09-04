package metodo;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class Trabajo7 {
    
    public Trabajo7() {
        mapeo(null);
    }
    
    public void mapeo(String[] args) {
        HashMap<String, String> diccionarioIngles = new HashMap<>();
        diccionarioIngles.put("bear", "oso");
        diccionarioIngles.put("brown", "café");
        diccionarioIngles.put("coffee", "cafe");
        diccionarioIngles.put("tall", "alto");
        diccionarioIngles.put("small", "corto");
        diccionarioIngles.put("shop", "tienda");
        diccionarioIngles.put("car", "carro");
             
        String menu = "Diccionario Ingles\n\n";
        menu += "1. Bear\n";
        menu += "2. Brown\n";
        menu += "3. coffee\n";
        menu += "4. tall\n";
        menu += "5. small\n";
        menu += "6. shop\n";
        menu += "7. car\n\n";
        menu += "8. Ingrese una palabra en inglés:";

        String palabra = JOptionPane.showInputDialog(menu).toLowerCase();

        if (diccionarioIngles.containsKey(palabra)) {
            String traduccion = diccionarioIngles.get(palabra);
            JOptionPane.showMessageDialog(null, "Traducción al español: " + traduccion);
        } else {
            JOptionPane.showMessageDialog(null, "La palabra no está en el diccionario.");
        }


    }
}
