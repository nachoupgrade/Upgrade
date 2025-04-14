
#  Boletín de Ejercicios Temas 2 al 9 – Solucionado

## UpgradeHub 1º DAM/DAW


_Estructurados por tema y dificultad_

---

## 📄 2. Introducción a Java

1. **Hola Mundo:**
Escribe un programa que muestre en pantalla el mensaje "Hola, mundo".

💡 **Solución:** Este programa imprime un saludo por consola.
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, mundo");
    }
}
```
  
   

2. **Suma de dos números:**
Pide dos números enteros al usuario y muestra su suma.

💡 **Solución:** Se utilizan variables `a` y `b` para capturar los números, luego se suman e imprimen.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();
        int suma = a + b;
        System.out.println("La suma es: " + suma);
    }
}
```
  

3. **Conversión de temperaturas:**
Convierte grados Celsius a Fahrenheit usando una fórmula. Fahrenheit = (ºCelsius * 9/5) + 32
Ejemplo: 20º Celsius = 68 Fahrenheit -> (20*9/5) + 32

💡 **Solución:**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce grados Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Equivale a " + fahrenheit + "°F");
    }
}
```
  

4. **Área de un triángulo:**
Pide la base y la altura de un triángulo y calcula su área.
(El área de un triángulo se calcula multiplicando la base * altura / 2)

💡 **Solución:**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        double base = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("Área del triángulo: " + area);
    }
}
```


5. **Operaciones aritméticas básicas:**
Pide dos números y muestra: suma, resta, multiplicación y división.

💡 **Solución:**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número 1: ");
        int a = sc.nextInt();
        System.out.print("Número 2: ");
        int b = sc.nextInt();
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        if (b != 0) {
            System.out.println("División: " + (a / b));
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }
}
```
  
   

---

## 📄 3. Uso de estructuras de control

1. **Número par o impar:**
Determina si un número introducido es par o impar.
   
💡 **Solución:**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
}
```
  


2. **Mayor de tres números:**
Pide tres números e indica cuál es el mayor.

💡 **Solución:**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int mayor = a;
        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;
        System.out.println("El mayor es: " + mayor);
    }
}
```
  
   

3. **Tabla de multiplicar:**
Muestra la tabla del número introducido (1 al 10).

💡 **Solución:**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
```
  
   

4. **Contador de 1 a N:**
Muestra los números del 1 al número N que introduzca el usuario.

💡 **Solución:**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
```
  
   

5. **Número primo:**
Verifica si un número dado es primo.
(Un número es primo si solo se puede dividir entre 1 y sí mismo)

💡 **Solución:**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean primo = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        System.out.println(primo ? "Es primo" : "No es primo");
    }
}
```
  
   

6. **Menú con switch:**
Crea un menú que permita al usuario elegir entre varias opciones y actuar en consecuencia.

💡 **Solución:**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Saludar\n2. Salir");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1: System.out.println("¡Hola!"); break;
            case 2: System.out.println("Adiós"); break;
            default: System.out.println("Opción no válida");
        }
    }
}
```
  
   

---

## 📄 4. Estructuras de datos estáticas

1. **Array de 5 enteros:**
Rellena un array con 5 números introducidos por el usuario y muéstralos.

💡 **Solución:**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números introducidos:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
```
  
   

2. **Suma de un array:**  
Calcula la suma total de los elementos de un array.

💡 **Solución:**
```java
public class SumaArray {
    public static void main(String[] args) {
        int[] numeros = {3, 7, 1, 9, 4}; // Array de ejemplo
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        System.out.println("La suma total es: " + suma);
    }
}
```

   

3. **Buscar un número en un array:**  
Indica si un número dado se encuentra en el array.

💡 **Solución:**
```java
   import java.util.Scanner;

public class BuscarEnArray {
    public static void main(String[] args) {
        int[] numeros = {5, 8, 12, 3, 7}; // Array de ejemplo
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número que deseas buscar: ");
        int buscado = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                encontrado = true;
                break; // Sale del bucle al encontrar el número
            }
        }

        if (encontrado) {
            System.out.println("El número " + buscado + " SÍ se encuentra en el array.");
        } else {
            System.out.println("El número " + buscado + " NO se encuentra en el array.");
        }

        scanner.close();
    }
}
```

4. **Mayor y menor de un array:**  
Determina el valor más alto y el más bajo en un array de enteros.

💡 **Solución:**
```java
   
   public class MinMaxArray {
    public static void main(String[] args) {
        int[] numeros = {15, 2, 89, 42, 7, 56}; // Array de ejemplo
        
        int min = numeros[0]; // Inicializamos el valor mínimo con el primer elemento
        int max = numeros[0]; // Inicializamos el valor máximo con el primer elemento

        for (int i = 1; i < numeros.length; i++) { // Comenzamos desde el segundo elemento
            if (numeros[i] < min) {
                min = numeros[i]; // Actualizamos el valor mínimo
            }
            if (numeros[i] > max) {
                max = numeros[i]; // Actualizamos el valor máximo
            }
        }

        System.out.println("El valor más bajo es: " + min);
        System.out.println("El valor más alto es: " + max);
    }
}
```

5. **Media de notas:**  
Pide las notas de 10 alumnos, guárdalas en un array y calcula la media.

💡 **Solución:**
```java
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[10]; // Array para las notas de 10 alumnos
        double suma = 0; // Variable para sumar las notas

        // Pedir las notas de los 10 alumnos
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Introduce la nota del alumno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            suma += notas[i]; // Sumar la nota al total
        }

        // Calcular la media
        double media = suma / notas.length;

        // Mostrar la media
        System.out.println("La media de las notas es: " + media);

        scanner.close();
    }
}
```



6. **Suma de una matriz:**  
Rellena una matriz de 2x3 de números enteros (int) y suma todos sus elementos.

💡 **Solución:**
```java
import java.util.Scanner;

public class SumaMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[2][3]; // Creamos una matriz de 2 filas y 3 columnas
        int suma = 0;

        // Pedimos al usuario que introduzca los valores
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Introduce el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt(); // Guardamos el valor introducido
                suma += matriz[i][j]; // Vamos sumando los valores
            }
        }

        // Mostramos la matriz
        System.out.println("\nMatriz introducida:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Mostramos la suma total
        System.out.println("\nSuma total: " + suma);
        sc.close();
    }
}

```
---

## 📄 5. Programación modular

1. **Método que saluda:**  
Crea un método que reciba un nombre y salude: `saludar("Ana") → "Hola, Ana"`.

💡 **Solución:**
```java
public class MetodoSaludo {
    public static void main(String[] args) {
        // Llamar al método saludar con el nombre "Ana"
        System.out.println(saludar("Ana"));
    }

    // Método que recibe un nombre y devuelve un saludo
    public static String saludar(String nombre) {
        return "Hola, " + nombre;
    }
}
```




2. **Método suma:**
Escribe un método que reciba dos números y devuelva su suma.

💡 **Solución:**
```java
public class MetodoSumar {
    public static void main(String[] args) {
        System.out.println("La suma es: " + sumar(5, 3));
    }

    public static int sumar(int a, int b) {
        return a + b;
    }
}
```
  
   

3. **Comprobar número primo (modular):**  
Convierte el ejercicio del número primo en un método.

💡 **Solución:**
```java
import java.util.Scanner;

public class MetodoPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // Leer el número introducido por el usuario

        // Llamar al método esPrimo para verificar si el número es primo
        boolean primo = esPrimo(num);

        // Imprimir el resultado
        System.out.println(primo ? "Es primo" : "No es primo");
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }

        // Verificar si el número es divisible por algún número desde 2 hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Si el número es divisible por i, no es primo
            }
        }

        return true; // Si no es divisible por ningún número, es primo
    }
}
```


4. **Cálculo de factorial:**  
Implementa un método que calcule el factorial de un número.\
El factorial de un número n (denotado como n!) se calcula como el producto de todos los números enteros positivos desde 1 hasta n.\
Ejemplo: 5! = 5 * 4 * 3 * 2 * 1 = 120


💡 **Solución:**
```java
public class Factorial {
    public static void main(String[] args) {
        int numero = 5; // Número del cual queremos calcular el factorial
        System.out.println("El factorial de " + numero + " es: " + calcularFactorial(numero));
    }

    // Método para calcular el factorial de un número
    public static long calcularFactorial(int numero) {
        if (numero == 0) {
            return 1; // El factorial de 0 es 1
        }

        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i; // Multiplicamos los números del 1 al número
        }

        return factorial;
    }
}
```


5. **Calculadora modular:**  
Crea una calculadora que use un método para cada operación: suma, resta, multiplicación y división.

💡 **Solución:**
```java
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Selecciona la operación: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int opcion = sc.nextInt();

        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = suma(num1, num2);
                break;
            case 2:
                resultado = resta(num1, num2);
                break;
            case 3:
                resultado = multiplicacion(num1, num2);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = division(num1, num2);
                } else {
                    System.out.println("Error: No se puede dividir entre 0.");
                    return;
                }
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        System.out.println("El resultado es: " + resultado);
        sc.close();
    }

    // Método para sumar
    public static double suma(double a, double b) {
        return a + b;
    }

    // Método para restar
    public static double resta(double a, double b) {
        return a - b;
    }

    // Método para multiplicar
    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    // Método para dividir
    public static double division(double a, double b) {
        return a / b;
    }
}
```


---

## 📄 6. Programación orientada a objetos

1. **Clase Coche:**
Crea una clase `Coche` con atributos: marca, modelo y velocidad. Crea un objeto y muestra sus datos.

💡 **Solución:**
```java
public class Coche {
    String marca;
    String modelo;
    int velocidad;

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.marca = "Toyota";
        miCoche.modelo = "Corolla";
        miCoche.velocidad = 120;
        System.out.println("Marca: " + miCoche.marca);
        System.out.println("Modelo: " + miCoche.modelo);
        System.out.println("Velocidad: " + miCoche.velocidad + " km/h");
    }
}
``` 
   

2. **Constructor y método mostrar():**  
Añade un constructor y un método `mostrar()` que imprima los datos del coche.

💡 **Solución:**
```java
public class Coche {
    String marca;
    String modelo;
    int velocidad;

    // Constructor para inicializar los valores del coche
    public Coche(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    // Método mostrar() para imprimir los datos del coche
    public void mostrar() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidad: " + this.velocidad + " km/h");
    }

    public static void main(String[] args) {
        // Crear un objeto Coche usando el constructor
        Coche miCoche = new Coche("Toyota", "Corolla", 120);

        // Llamar al método mostrar() para imprimir los datos del coche
        miCoche.mostrar();
    }
}
```



3. **Clase Rectángulo:**  
Crea una clase `Rectangulo` con base y altura. Añade un método para calcular el área.\
El área del rectángulo se calcula con la fórmula: (base * altura)

💡 **Solución:**
```java
public class Rectangulo {
    // Atributos base y altura
    double base;
    double altura;

    // Constructor para inicializar el rectángulo con base y altura
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área del rectángulo
    public double calcularArea() {
        return this.base * this.altura;
    }

    public static void main(String[] args) {
        // Crear un objeto Rectangulo con base = 5 y altura = 3
        Rectangulo miRectangulo = new Rectangulo(5, 3);

        // Calcular e imprimir el área del rectángulo
        double area = miRectangulo.calcularArea();
        System.out.println("El área del rectángulo es: " + area);
    }
}

```

4. **Contador de objetos:**  
Crea una clase que lleve la cuenta de cuántos objetos se han creado (usa un atributo `static`).\
El atributo `static` garantiza que todos los objetos compartan el mismo valor de contador, lo que permite llevar el registro de cuántos objetos han sido creados en total.

💡 **Solución:**
```java
public class CuentaObjetos {
    // Atributo estático para contar los objetos creados
    private static int contador = 0;

    // Constructor
    public CuentaObjetos() {
        // Cada vez que se crea un objeto, se incrementa el contador
        contador++;
    }

    // Método estático para obtener el número de objetos creados
    public static int obtenerCuenta() {
        return contador;
    }

    public static void main(String[] args) {
        // Crear varios objetos
        CuentaObjetos obj1 = new CuentaObjetos();
        CuentaObjetos obj2 = new CuentaObjetos();
        CuentaObjetos obj3 = new CuentaObjetos();

        // Mostrar la cantidad de objetos creados
        System.out.println("Número de objetos creados: " + CuentaObjetos.obtenerCuenta());
    }
}

```


5. **Clase CuentaBancaria:**  
Implementa una clase que simule una cuenta bancaria con saldo, ingreso y retiro.\
Se inicia con un saldo de 1000.\
Se ingresa 500, aumentando el saldo a 1500.\
Se retiran 300, quedando el saldo en 1200.\
Intentamos retirar 2000, pero no es posible debido a que el saldo es insuficiente.\
Finalmente, se muestra el saldo final, que es 1200.

💡 **Solución:**
```java
public class CuentaBancaria {
    // Atributos de la cuenta bancaria
    private double saldo;

    // Constructor para inicializar la cuenta con un saldo inicial
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para realizar un ingreso (depósito) en la cuenta
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Ingreso de " + cantidad + " realizado exitosamente.");
        } else {
            System.out.println("La cantidad a ingresar debe ser positiva.");
        }
    }

    // Método para realizar un retiro de la cuenta
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Retiro de " + cantidad + " realizado exitosamente.");
            } else {
                System.out.println("Saldo insuficiente para realizar el retiro.");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser positiva.");
        }
    }

    // Método para obtener el saldo actual de la cuenta
    public double obtenerSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        // Crear una cuenta bancaria con un saldo inicial de 1000
        CuentaBancaria miCuenta = new CuentaBancaria(1000);

        // Mostrar el saldo inicial
        System.out.println("Saldo inicial: " + miCuenta.obtenerSaldo());

        // Realizar un ingreso de 500
        miCuenta.ingresar(500);

        // Realizar un retiro de 300
        miCuenta.retirar(300);

        // Intentar un retiro mayor que el saldo disponible
        miCuenta.retirar(2000);

        // Mostrar el saldo final
        System.out.println("Saldo final: " + miCuenta.obtenerSaldo());
    }
}

```


---

## 📄 7. Utilización de objetos y desarrollo de clases

1. **Clase Persona:**  
Crea una clase `Persona` con nombre, edad y dirección.

💡 **Solución:**
```java
public class Persona {
    // Atributos de la clase Persona
    String nombre;
    int edad;
	String direccion;
    
    // Constructor para inicializar los atributos de la Persona
    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Método para mostrar la información de la persona
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
    }

    public static void main(String[] args) {
        // Crear un objeto Persona
        Persona persona = new Persona("Juan Pérez", 30, "Calle Falsa 123, Madrid");

        // Mostrar la información de la persona
        persona.mostrarInfo();
    }
}
```


2. **Clase Alumno y Curso:**  
Crea una clase `Alumno` con nombre, nota y un objeto `Curso`.

💡 **Solución:**
```java
public class Alumno {
    // Atributos de la clase Alumno
    String nombre;
    double nota;
    Curso curso;

    // Constructor para inicializar los atributos del Alumno
    public Alumno(String nombre, double nota, Curso curso) {
        this.nombre = nombre;
        this.nota = nota;
        this.curso = curso;
    }

    // Método para mostrar la información del Alumno
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota: " + nota);
        System.out.println("Curso: " + curso.obtenerCurso());
    }

    public static void main(String[] args) {
        // Crear un objeto Curso
        Curso curso = new Curso("Matemáticas", "101");

        // Crear un objeto Alumno
        Alumno alumno = new Alumno("Ana García", 9.5, curso);

        // Mostrar la información del alumno
        alumno.mostrarInfo();
    }
}

class Curso {
    // Atributos de la clase Curso
    String nombreCurso;
    String codigoCurso;

    // Constructor para inicializar los atributos del Curso
    public Curso(String nombreCurso, String codigoCurso) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
    }

    // Método para obtener la información del curso
    public String obtenerCurso() {
        return nombreCurso + " (Código: " + codigoCurso + ")";
    }
}

```


3. **Agenda de contactos:**  
Cada contacto tiene nombre, teléfono y correo. Usa una clase `Contacto`.

💡 **Solución:**
```java
public class Contacto {
    // Atributos de la clase Contacto
    String nombre;
    String telefono;
    String correo;

    // Constructor para inicializar los atributos del Contacto
    public Contacto(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    // Método para mostrar la información del Contacto
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Correo: " + correo);
    }

    public static void main(String[] args) {
        // Crear un objeto Contacto
        Contacto contacto = new Contacto("Carlos López", "123-456-789", "carlos@correo.com");

        // Mostrar la información del contacto
        contacto.mostrarInfo();
    }
}

```


4. **Relación entre clases:**  
Crea una clase `Empleado` y una clase `Empresa`. Una empresa tiene varios empleados.

💡 **Solución:**
```java
import java.util.ArrayList;

public class Empleado {
    // Atributos de la clase Empleado
    String nombre;
    String puesto;
    double salario;

    // Constructor para inicializar los atributos del Empleado
    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    // Método para mostrar la información del Empleado
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: " + salario);
    }
}

class Empresa {
    // Atributo de la clase Empresa: lista de empleados
    String nombreEmpresa;
    ArrayList<Empleado> empleados;

    // Constructor para inicializar los atributos de la Empresa
    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.empleados = new ArrayList<>();
    }

    // Método para agregar un empleado a la empresa
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    // Método para mostrar la información de todos los empleados de la empresa
    public void mostrarEmpleados() {
        System.out.println("Empleados de la empresa: " + nombreEmpresa);
        for (Empleado empleado : empleados) {
            empleado.mostrarInfo();
            System.out.println("------------------------------");
        }
    }

    public static void main(String[] args) {
        // Crear objetos Empleado
        Empleado empleado1 = new Empleado("Ana Pérez", "Desarrolladora", 2500);
        Empleado empleado2 = new Empleado("Jorge Gómez", "Diseñador", 2200);
        Empleado empleado3 = new Empleado("Carlos López", "Gerente", 3500);

        // Crear un objeto Empresa
        Empresa empresa = new Empresa("Tech Innovators");

        // Agregar empleados a la empresa
        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);
        empresa.agregarEmpleado(empleado3);

        // Mostrar la información de todos los empleados de la empresa
        empresa.mostrarEmpleados();
    }
}

```


5. **Catálogo de libros:**  
Clase `Libro` con título, autor y año. Guarda varios libros en una clase `Biblioteca`.

💡 **Solución:**
```java
import java.util.ArrayList;

public class Libro {
    // Atributos de la clase Libro
    String titulo;
    String autor;
    int año;

    // Constructor para inicializar los atributos del Libro
    public Libro(String titulo, String autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

    // Método para mostrar la información del Libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + año);
    }
}

class Biblioteca {
    // Atributo de la clase Biblioteca: lista de libros
    String nombreBiblioteca;
    ArrayList<Libro> libros;

    // Constructor para inicializar los atributos de la Biblioteca
    public Biblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.libros = new ArrayList<>();
    }

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para mostrar la información de todos los libros de la biblioteca
    public void mostrarLibros() {
        System.out.println("Libros en la biblioteca: " + nombreBiblioteca);
        for (Libro libro : libros) {
            libro.mostrarInfo();
            System.out.println("------------------------------");
        }
    }

    public static void main(String[] args) {
        // Crear objetos Libro
        Libro libro1 = new Libro("El cuento de la criada", "Margaret Atwood", 1985);
        Libro libro2 = new Libro("Dune", "Frank Herbert", 1965);
        Libro libro3 = new Libro("Juego de tronos", "George R. R. Martin", 1996);

        // Crear un objeto Biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Mostrar la información de todos los libros en la biblioteca
        biblioteca.mostrarLibros();
    }
}

```


---

## 📄 8. Utilización avanzada de clases

1. **Getters y setters:**  
Encapsula los atributos de una clase `Persona` usando getters/setters.\
Encapsulamiento: Los atributos de la clase Persona están privados, lo que significa que no se pueden acceder directamente desde fuera de la clase. En su lugar, se usan getters para obtener sus valores y setters para modificarlos


💡 **Solución:**
```java
public class Persona {
    // Atributos privados de la clase Persona (encapsulamiento)
    private String nombre;
    private int edad;
    private String direccion;

    // Constructor para inicializar los atributos
    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Getter para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para modificar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para obtener la edad
    public int getEdad() {
        return edad;
    }

    // Setter para modificar la edad
    public void setEdad(int edad) {
        if (edad > 0) {  // Validación básica: la edad debe ser mayor que 0
            this.edad = edad;
        } else {
            System.out.println("Edad no válida.");
        }
    }

    // Getter para obtener la dirección
    public String getDireccion() {
        return direccion;
    }

    // Setter para modificar la dirección
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Método para mostrar la información de la persona
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
    }

    public static void main(String[] args) {
        // Crear un objeto Persona usando el constructor
        Persona persona = new Persona("Juan Pérez", 30, "Calle Falsa 123");

        // Mostrar la información inicial
        persona.mostrarInfo();

        // Modificar los atributos utilizando setters
        persona.setNombre("Carlos López");
        persona.setEdad(35);
        persona.setDireccion("Avenida Siempre Viva 742");

        // Mostrar la nueva información
        System.out.println("\nDespués de modificar los datos:");
        persona.mostrarInfo();
    }
}

```


2. **Herencia (Animal → Perro):**  
Crea una clase `Animal` y una subclase `Perro` que herede de ella.

💡 **Solución:**
```java
// Clase base: Animal
class Animal {
    // Atributos comunes de todos los animales
    String nombre;
    int edad;

    // Constructor para inicializar los atributos
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método común: hacer un sonido
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }

    // Método para mostrar la información del animal
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
}

// Subclase: Perro (hereda de Animal)
class Perro extends Animal {
    // Atributo específico de la clase Perro
    String raza;

    // Constructor de la subclase Perro
    public Perro(String nombre, int edad, String raza) {
        // Llamada al constructor de la clase base (Animal)
        super(nombre, edad);
        this.raza = raza;
    }

    // Sobrescribir el método hacerSonido() para el perro
    @Override
    public void hacerSonido() {
        System.out.println("El perro hace: ¡Guau!");
    }

    // Método específico de la clase Perro
    public void mostrarRaza() {
        System.out.println("Raza: " + raza);
    }

    // Método para mostrar la información del perro (incluyendo la info de Animal)
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamar al método mostrarInfo() de la clase base
        mostrarRaza(); // Mostrar la raza del perro
    }
}

// Clase principal con el método main
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de tipo Perro
        Perro miPerro = new Perro("Rex", 5, "Labrador");

        // Mostrar la información del perro
        miPerro.mostrarInfo();

        // Hacer que el perro haga un sonido
        miPerro.hacerSonido();
    }
}

```


3. **Clase abstracta Figura:**  
Define una clase abstracta `Figura` con método `calcularArea()` y clases hijas `Círculo`, `Cuadrado`.

💡 **Solución:**
```java
// Clase abstracta Figura
abstract class Figura {
    // Método abstracto que debe ser implementado por las clases hijas
    public abstract double calcularArea();
}

// Clase Círculo que hereda de Figura
class Circulo extends Figura {
    private double radio;

    // Constructor para inicializar el radio del círculo
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementación del método calcularArea() para el círculo
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;  // Fórmula del área del círculo: A = π * r²
    }
}

// Clase Cuadrado que hereda de Figura
class Cuadrado extends Figura {
    private double lado;

    // Constructor para inicializar el lado del cuadrado
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Implementación del método calcularArea() para el cuadrado
    @Override
    public double calcularArea() {
        return lado * lado;  // Fórmula del área del cuadrado: A = l²
    }
}

// Clase principal con el método main
public class Main {
    public static void main(String[] args) {
        // Crear un objeto Círculo con radio 5
        Figura circulo = new Circulo(5);
        System.out.println("Área del círculo: " + circulo.calcularArea());

        // Crear un objeto Cuadrado con lado 4
        Figura cuadrado = new Cuadrado(4);
        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
    }
}

```


4. **Interfaz `Imprimible`:**  
Define una interfaz con un método `imprimir()` y aplícalo en distintas clases (`Factura`, `Informe`, etc.)

💡 **Solución:**
```java
// Interfaz Imprimible
interface Imprimible {
    // Método abstracto que deben implementar las clases
    void imprimir();
}

// Clase Factura que implementa la interfaz Imprimible
class Factura implements Imprimible {
    private String cliente;
    private double monto;

    // Constructor para inicializar los atributos
    public Factura(String cliente, double monto) {
        this.cliente = cliente;
        this.monto = monto;
    }

    // Implementación del método imprimir() para la clase Factura
    @Override
    public void imprimir() {
        System.out.println("Factura para el cliente: " + cliente);
        System.out.println("Monto a pagar: $" + monto);
    }
}

// Clase Informe que implementa la interfaz Imprimible
class Informe implements Imprimible {
    private String titulo;
    private String contenido;

    // Constructor para inicializar los atributos
    public Informe(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    // Implementación del método imprimir() para la clase Informe
    @Override
    public void imprimir() {
        System.out.println("Informe: " + titulo);
        System.out.println("Contenido: " + contenido);
    }
}

// Clase principal con el método main
public class Main {
    public static void main(String[] args) {
        // Crear objetos Factura e Informe
        Factura factura = new Factura("Juan Pérez", 250.75);
        Informe informe = new Informe("Análisis de ventas", "Se observa un crecimiento del 10%.");

        // Llamar al método imprimir() de cada objeto
        imprimirDocumento(factura);  // Polimorfismo: Factura implementa Imprimible
        imprimirDocumento(informe);  // Polimorfismo: Informe implementa Imprimible
    }

    // Método que acepta cualquier objeto que implemente la interfaz Imprimible
    public static void imprimirDocumento(Imprimible imprimible) {
        imprimible.imprimir();
        System.out.println("------------------------------");
    }
}

```


5. **Sobrecarga de métodos:**  
Implementa una clase que tenga varios métodos `calcular()` con diferentes parámetros.

💡 **Solución:**
```java
// Clase Calculadora con métodos calcular() sobrecargados
class Calculadora {

    // Método para sumar dos números enteros
    public int calcular(int a, int b) {
        return a + b;
    }

    // Método para sumar tres números enteros
    public int calcular(int a, int b, int c) {
        return a + b + c;
    }

    // Método para sumar dos números de tipo double
    public double calcular(double a, double b) {
        return a + b;
    }

    // Método para calcular el área de un círculo (calcular con radio)
    public double calcular(double radio) {
        return Math.PI * radio * radio;  // Área del círculo: A = π * r²
    }

    // Método para multiplicar dos números enteros
    public int calcular(int a, int b, String operacion) {
        if (operacion.equals("multiplicar")) {
            return a * b;
        }
        return 0;
    }

    // Método para realizar una operación de potencia (base^exponente)
    public double calcular(double base, int exponente) {
        return Math.pow(base, exponente);
    }
}

// Clase principal con el método main
public class Main {
    public static void main(String[] args) {
        // Crear objeto de la clase Calculadora
        Calculadora calculadora = new Calculadora();

        // Llamadas a los métodos calcular() con diferentes parámetros
        System.out.println("Suma de 2 enteros: " + calculadora.calcular(5, 3)); // Suma de dos enteros
        System.out.println("Suma de 3 enteros: " + calculadora.calcular(5, 3, 2)); // Suma de tres enteros
        System.out.println("Suma de 2 doubles: " + calculadora.calcular(5.5, 3.2)); // Suma de dos doubles
        System.out.println("Área del círculo con radio 7: " + calculadora.calcular(7)); // Área del círculo
        System.out.println("Multiplicación de 4 y 5: " + calculadora.calcular(4, 5, "multiplicar")); // Multiplicación
        System.out.println("Potencia de 2^3: " + calculadora.calcular(2, 3)); // Potencia
    }
}

```


---

## 📄 9. Colecciones dinámicas de datos

1. **Lista de nombres (`ArrayList`):**  
Pide nombres al usuario hasta escribir “fin” y guárdalos en un `ArrayList`.

💡 **Solución:**
```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar los nombres
        ArrayList<String> nombres = new ArrayList<>();
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        String nombre;

        // Pedir nombres al usuario hasta que escriba "fin"
        while (true) {
            System.out.print("Escribe un nombre (o escribe 'fin' para terminar): ");
            nombre = scanner.nextLine();
            
            // Si el usuario escribe "fin", salir del bucle
            if (nombre.equals("fin")) {
                break;
            }

            // Agregar el nombre al ArrayList
            nombres.add(nombre);
        }

        // Mostrar todos los nombres almacenados
        System.out.println("\nLos nombres almacenados son:");
        for (String n : nombres) {
            System.out.println(n);
        }

        // Cerrar el scanner
        scanner.close();
    }
}

```


2. **Buscar en una lista:**  
Busca si un nombre concreto está dentro de la lista anterior.

💡 **Solución:**
```java
import java.util.ArrayList;
import java.util.Scanner;

public class BuscarEnLista {
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar los nombres
        ArrayList<String> nombres = new ArrayList<>();
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        String nombre;

        // Pedir nombres al usuario hasta que escriba "fin"
        while (true) {
            System.out.print("Introduce un nombre (o escribe 'fin' para terminar): ");
            nombre = scanner.nextLine();
            
            // Si el usuario escribe "fin", salir del bucle
            if (nombre.equals("fin")) {
                break;
            }

            // Agregar el nombre al ArrayList
            nombres.add(nombre);
        }

        // Pedir un nombre para buscar en la lista
        System.out.print("\nIntroduce un nombre para buscar: ");
        String buscar = scanner.nextLine();

        // Verificar si el nombre introducido está en la lista
        if (nombres.contains(buscar)) {
            System.out.println("El nombre " + buscar + " está en la lista.");
        } else {
            System.out.println("El nombre " + buscar + " no está en la lista.");
        }

        // Mostrar todos los nombres almacenados
        System.out.println("\nLos nombres introducidos son:");
        for (String n : nombres) {
            System.out.println(n);
        }

        // Cerrar el scanner
        scanner.close();
    }
}

```


3. **Agenda de teléfonos (`HashMap`):**  
Guarda pares nombre → teléfono en un diccionario `HashMap`.

💡 **Solución:**
```java
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class AgendaTelefonos {
    public static void main(String[] args) {
        // Crear un HashMap para almacenar los pares nombre -> teléfono
        HashMap<String, String> agenda = new HashMap<>();
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        String nombre;
        String telefono;

        // Bucle para introducir contactos hasta que el usuario decida parar
        while (true) {
            System.out.print("Introduce un nombre (o escribe 'fin' para terminar): ");
            nombre = scanner.nextLine();
            
            // Si el usuario escribe "fin", salir del bucle
            if (nombre.equals("fin")) {
                break;
            }

            // Pedir el teléfono para ese nombre
            System.out.print("Introduce el número de teléfono de " + nombre + ": ");
            telefono = scanner.nextLine();
            
            // Guardar el nombre y teléfono en el HashMap
            agenda.put(nombre, telefono);
        }

        // Pedir un nombre para buscar su número de teléfono
        System.out.print("\nIntroduce un nombre para buscar su teléfono: ");
        String buscar = scanner.nextLine();

        // Verificar si el nombre está en la agenda
        if (agenda.containsKey(buscar)) {
            System.out.println("El número de teléfono de " + buscar + " es: " + agenda.get(buscar));
        } else {
            System.out.println("El nombre " + buscar + " no está en la agenda.");
        }

        // Mostrar todos los contactos almacenados
        System.out.println("\nAgenda de teléfonos con bucle for-each:");
        for (Map.Entry<String, String> entrada : agenda.entrySet()) {
            System.out.println("Nombre: " + entrada.getKey() + " | Teléfono: " + entrada.getValue());
        }
        
        System.out.println("\nAgenda de teléfonos con Iterator:");
        Iterator<Map.Entry<String, String>> iterador = agenda.entrySet().iterator();
        while (iterador.hasNext()) {
            Map.Entry<String, String> entrada = iterador.next();
            System.out.println("Nombre: " + entrada.getKey() + " | Teléfono: " + entrada.getValue());
        }

        System.out.println("\nAgenda de teléfonos con bucle for-each y expresión lambda:");
        agenda.forEach((nombreContacto, telefonoContacto) -> {
            System.out.println("Nombre: " + nombreContacto + " | Teléfono: " + telefonoContacto);
        });

        // Cerrar el scanner
        scanner.close();
    }
}

```


4. **Contador de palabras:**  
Lee una frase del usuario y cuenta cuántas veces aparece cada palabra usando un diccionario `HashMap`.

💡 **Solución:**
```java
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que escriba una frase
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        // Crear un HashMap para contar las palabras
        HashMap<String, Integer> palabraCount = new HashMap<>();

        // Dividir la frase en palabras separadas por uno o más espacios
		String[] palabras = frase.split(" ");


        // Recorrer las palabras y contar cuántas veces aparece cada una
        for (String palabra : palabras) {
            palabra = palabra.toLowerCase();  // Hacer todo en minúsculas para evitar duplicados por mayúsculas
            if (palabraCount.containsKey(palabra)) {
                // Si la palabra ya está en el HashMap, incrementar su contador
                palabraCount.put(palabra, palabraCount.get(palabra) + 1);
            } else {
                // Si la palabra no está en el HashMap, agregarla con contador 1
                palabraCount.put(palabra, 1);
            }
        }

        // Mostrar las palabras y cuántas veces se repiten
        System.out.println("\nFrecuencia de palabras:");
        for (String palabra : palabraCount.keySet()) {
            System.out.println(palabra + ": " + palabraCount.get(palabra));
        }

        // Cerrar el scanner
        scanner.close();
    }
}

```


5. **Invertir una cadena de texto:**  
Lee una cadena de texto y luego inviértela utilizando una pila (`Stack`). Para ello, vamos a ir apilando cada uno de los caracteres de la cadena y luego los iremos sacando para formar la cadena invertida.
_Ejemplo:_
Cadena original: Hola Mundo
Cadena invertida: odnuM aloH

💡 **Solución:**
```java
import java.util.Stack;

public class Main {

    // Método para invertir una cadena usando una pila
    public static String invertirCadena(String cadena) {
        Stack<Character> pila = new Stack<>();
        
        // Apilar todos los caracteres de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            pila.push(cadena.charAt(i));
        }
        
        // Extraer los caracteres de la pila y formar la cadena invertida
        StringBuilder cadenaInvertida = new StringBuilder();
        while (!pila.isEmpty()) {
            cadenaInvertida.append(pila.pop());
        }
        
        return cadenaInvertida.toString();
    }

    public static void main(String[] args) {
        // Cadena a invertir
        String texto = "Hola Mundo";
        
        // Invertir la cadena
        String textoInvertido = invertirCadena(texto);
        
        // Mostrar el resultado
        System.out.println("Cadena original: " + texto);
        System.out.println("Cadena invertida: " + textoInvertido);
    }
}

```

