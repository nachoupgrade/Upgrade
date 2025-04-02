import java.util.Stack;

public class VerificadorParentesis {
    
    // Devuelve true si la operación está bien estructurada (cierra todos los paréntesis que abre y no sobra ninguno)
    public static boolean estaBienEstructurada(String operacion) {
        Stack<Character> pila = new Stack<>();

        for (char c : operacion.toCharArray()) {
            // Si tenemos un paréntesis abierto, lo añadimos a la pila
            System.out.println("Carácter: " + c);
            if (c == '(') {
                System.out.println("Añado con push a la pila: " + c);
                pila.push(c);
            } else if (c == ')') {
                if (pila.isEmpty()) {
                    System.out.println("Error. La pila está vacía.");
                    return false; // Hay un paréntesis de cierre sin apertura
                }
                System.out.println("Saco el elemento de la pila.");
                pila.pop();
            }
        }
        System.out.println("No he encontrado errores y la pila ya está vacía.");
        return pila.isEmpty(); // Si la pila está vacía, todo está bien estructurado

    }

    public static void main(String[] args) {
        String operacion1 = "(2+3)*(4+(5-1))"; // BIEN
        String operacion2 = "((2+3)*4+(5-1)";  // MAL
        String operacion3 = "(3+2))+(4+1)";    // MAL

        System.out.println("\nOperación 1: " + estaBienEstructurada(operacion1)); // true
        System.out.println("\nOperación 2: " + estaBienEstructurada(operacion2)); // true
        System.out.println("\nOperación 3: " + estaBienEstructurada(operacion3)); // true

    }

}
