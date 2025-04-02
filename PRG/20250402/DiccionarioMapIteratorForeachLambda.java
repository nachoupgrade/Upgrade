import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DiccionarioMapIteratorForeachLambda {
    public static void main(String[] args) {
        // Crear HashMap
        Map<String, Integer> palabrasQuijote = new HashMap<String, Integer>();

        // Insertar elementos
        palabrasQuijote.put("Quijote", 2174);
        palabrasQuijote.put("Sancho", 2147);
        palabrasQuijote.put("señor", 1063);
        palabrasQuijote.put("merced", 900);
        palabrasQuijote.put("caballero", 661);

        // Obtener el valor de una clave
        System.out.println("Veces que aparece 'señor': " +
                palabrasQuijote.get("señor"));

        // Imprimir (sin recorrer) el diccionario
        System.out.println("HashMap: " + palabrasQuijote);

        // Eliminar el valor de la clave "merced"
        palabrasQuijote.remove("merced");

        // Imprimir recorriendo con Iterator
        Set<Map.Entry<String, Integer>> set = palabrasQuijote.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> mentry = iterator.next();
            System.out.println("Clave: " + mentry.getKey() + " - Valor: " + mentry.getValue());
        }

        // Imprimir recorriendo con un bucle for-each:
        for (Map.Entry<String, Integer> entrada : palabrasQuijote.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + " - Valor " + entrada.getValue());
        }


        // Alternativa más moderna (Java 8+) con una expresión lambda:
        palabrasQuijote.forEach((clave, valor) ->
        System.out.println("Clave: " + clave + " - Valor " + valor ));

    }
}

