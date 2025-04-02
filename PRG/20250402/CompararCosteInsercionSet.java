import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CompararCosteInsercionSet {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<Integer>();
        long tiempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            hashSet.add(i);
        }
        long tiempoFinal = System.currentTimeMillis();
        System.out.println("Tiempo empleado por HashSet: " + (tiempoFinal - tiempoInicial) + " ms");

        Set<Integer> treeSet = new TreeSet<Integer>();
        tiempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            treeSet.add(i);
        }
        tiempoFinal = System.currentTimeMillis();
        System.out.println("Tiempo empleado por TreeSet: " + (tiempoFinal - tiempoInicial) + " ms");

        Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        tiempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            linkedHashSet.add(i);
        }
        tiempoFinal = System.currentTimeMillis();
        System.out.println("Tiempo empleado por LinkedHashSet: " + (tiempoFinal - tiempoInicial) + " ms");
    }
}
