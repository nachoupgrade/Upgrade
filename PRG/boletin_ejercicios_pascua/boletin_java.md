
#  Boletín de Ejercicios Temas 2 al 9

## UpgradeHub 1º DAM/DAW


_Estructurados por tema y dificultad_

---

## 📄 2. Introducción a Java

1. **Hola Mundo:**  
   Escribe un programa que muestre en pantalla el mensaje "Hola, mundo".

2. **Suma de dos números:**  
   Pide dos números enteros al usuario y muestra su suma.

3. **Conversión de temperaturas:**  
   Convierte grados Celsius a Fahrenheit usando una fórmula. Fahrenheit = (ºCelsius * 9/5) + 32\
   Ejemplo: 20º Celsius = 68 Fahrenheit -> (20*9/5) + 32

4. **Área de un triángulo:**
	Pide la base y la altura de un triángulo y calcula su área.\
	(El área de un triángulo se calcula multiplicando la base * altura / 2)

5. **Operaciones aritméticas básicas:**  
   Pide dos números y muestra: suma, resta, multiplicación y división.

---

## 📄 3. Uso de estructuras de control

1. **Número par o impar:**  
   Determina si un número introducido es par o impar.

2. **Mayor de tres números:**  
   Pide tres números e indica cuál es el mayor.

3. **Tabla de multiplicar:**  
   Muestra la tabla del número introducido (1 al 10).

4. **Contador de 1 a N:**  
   Muestra los números del 1 al número N que introduzca el usuario.

5. **Número primo:**  
   Verifica si un número dado es primo.\
   (Un número es primo si solo se puede dividir entre 1 y sí mismo)


6. **Menú con switch:**  
   Crea un menú que permita al usuario elegir entre varias opciones y actuar en consecuencia.

---

## 📄 4. Estructuras de datos estáticas

1. **Array de 5 enteros:**  
   Rellena un array con 5 números introducidos por el usuario y muéstralos.

2. **Suma de un array:**  
   Calcula la suma total de los elementos de un array.

3. **Buscar un número en un array:**  
   Indica si un número dado se encuentra en el array.

4. **Mayor y menor de un array:**  
   Determina el valor más alto y el más bajo en un array de enteros.

5. **Media de notas:**  
   Pide las notas de 10 alumnos, guárdalas en un array y calcula la media.

6. **Suma de una matriz:**  
   Rellena una matriz de 2x3 de números enteros (int) y suma todos sus elementos.

---

## 📄 5. Programación modular

1. **Método que saluda:**  
   Crea un método que reciba un nombre y salude: `saludar("Ana") → "Hola, Ana"`.

2. **Método suma:**  
   Escribe un método que reciba dos números y devuelva su suma.

3. **Comprobar número primo (modular):**  
   Convierte el ejercicio del número primo en un método.

4. **Cálculo de factorial:**  
    Implementa un método que calcule el factorial de un número.\
    El factorial de un número n (denotado como n!) se calcula como el producto de todos los números enteros positivos desde 1 hasta n.\
    Ejemplo: 5! = 5 * 4 * 3 * 2 * 1 = 120

5. **Calculadora modular:**  
   Crea una calculadora que use un método para cada operación: suma, resta, multiplicación y división.

---

## 📄 6. Programación orientada a objetos

1. **Clase Coche:**  
   Crea una clase `Coche` con atributos: marca, modelo y velocidad. Crea un objeto y muestra sus datos.

2. **Constructor y método mostrar():**  
   Añade un constructor y un método `mostrar()` que imprima los datos del coche.

3. **Clase Rectángulo:**  
	Crea una clase `Rectangulo` con base y altura. Añade un método para calcular el área.\
	El área del rectángulo se calcula con la fórmula: (base * altura)

4. **Contador de objetos:**  
   Crea una clase que lleve la cuenta de cuántos objetos se han creado (usa un atributo `static`).

5. **Clase CuentaBancaria:**  
   Implementa una clase que simule una cuenta bancaria con saldo, ingreso y retiro.\
   Se inicia con un saldo de 1000.\
   Se ingresa 500, aumentando el saldo a 1500.\
   Se retiran 300, quedando el saldo en 1200.\
   Intentamos retirar 2000, pero no es posible debido a que el saldo es insuficiente.\
   Finalmente, se muestra el saldo final, que es 1200.

---

## 📄 7. Utilización de objetos y desarrollo de clases

1. **Clase Persona:**  
   Crea una clase `Persona` con nombre, edad y dirección.

2. **Clase Alumno y Curso:**  
   Crea una clase `Alumno` con nombre, nota y un objeto `Curso`.

3. **Agenda de contactos:**  
   Cada contacto tiene nombre, teléfono y correo. Usa una clase `Contacto`.

4. **Relación entre clases:**  
   Crea una clase `Empleado` y una clase `Empresa`. Una empresa tiene varios empleados.

5. **Catálogo de libros:**  
   Clase `Libro` con título, autor y año. Guarda varios libros en una clase `Biblioteca`.

---

## 📄 8. Utilización avanzada de clases

1. **Getters y setters:**  
   Encapsula los atributos de una clase `Persona` usando getters/setters.

2. **Herencia (Animal → Perro):**  
   Crea una clase `Animal` y una subclase `Perro` que herede de ella.

3. **Clase abstracta Figura:**  
   Define una clase abstracta `Figura` con método `calcularArea()` y clases hijas `Círculo`, `Cuadrado`.

4. **Interfaz `Imprimible`:**  
   Define una interfaz con un método `imprimir()` y aplícalo en distintas clases (`Factura`, `Informe`, etc.)

5. **Sobrecarga de métodos:**  
   Implementa una clase que tenga varios métodos `calcular()` con diferentes parámetros.

---

## 📄 9. Colecciones dinámicas de datos

1. **Lista de nombres (`ArrayList`):**  
   Pide nombres al usuario hasta escribir “fin” y guárdalos en un `ArrayList`.

2. **Buscar en una lista:**  
   Busca si un nombre concreto está dentro de la lista anterior.

3. **Agenda de teléfonos (`HashMap`):**  
   Guarda pares nombre → teléfono en un `HashMap`.

4. **Contador de palabras:**  
   Lee una frase del usuario y cuenta cuántas veces aparece cada palabra usando un `HashMap`.

5. **Invertir una cadena de texto:**  
Lee una cadena de texto y luego inviértela utilizando una pila (`Stack`). Para ello, vamos a ir apilando cada uno de los caracteres de la cadena y luego los iremos sacando para formar la cadena invertida.
_Ejemplo:_
Cadena original: Hola Mundo
Cadena invertida: odnuM aloH
