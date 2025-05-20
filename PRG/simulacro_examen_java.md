
# 🧾 Simulacro de Examen Práctico de Programación en Java

**Duración:** 60 minutos  
**Lenguaje:** Java  
**Total puntos:** 10

---

## ✅ Instrucciones generales

- Responde todos los ejercicios.
- Puedes usar el IDE de tu elección.
- Se evaluará:
  - Lógica y estructura del código.
  - Uso correcto de clases, métodos y variables.
  - Claridad y limpieza del código.

---

## 📄 Ejercicio 1: Registro de nombres únicos  
📌 **Puntos:** 4  

Desarrolla un programa en Java que permita al usuario introducir nombres de personas. El programa debe:

1. Leer nombres desde la entrada estándar hasta que el usuario escriba `"fin"`.
2. Almacenar los nombres en un `ArrayList`.
3. No debe guardar nombres repetidos (si se repite uno, se ignora).
4. Al final, mostrar la lista completa de nombres introducidos sin duplicados.

### ✏️ Ejemplo de ejecución:

```
Introduce un nombre: Ana  
Introduce un nombre: Luis  
Introduce un nombre: Ana  
Introduce un nombre: fin  

Nombres registrados:  
- Ana  
- Luis
```

---

## 📄 Ejercicio 2: Clase `DescuentoSobrePrecio`  
📌 **Puntos:** 6

Crea una clase `DescuentoSobrePrecio` que gestione el cálculo de un precio con descuento aplicado. La clase debe contener los siguientes elementos:

- Atributos privados:
  - `nombreProducto` (String)
  - `precioOriginal` (double)
  - `descuento` (double)

- Un constructor que inicialice los atributos.
- Un método `precioFinalConDescuento()` que calcule y devuelva el precio con el descuento aplicado.  
  Fórmula: `precioFinal = precioOriginal - (precioOriginal * descuento / 100)`
  
- Un método `mostrarDetalles()` que imprima:
  - El nombre del producto
  - El precio original
  - El porcentaje de descuento
  - El precio final con descuento.

#### En el `main`:
- Crea un objeto `DescuentoSobrePrecio`.
- Llama al método `mostrarDetalles()`.

### ✏️ Ejemplo de ejecución:

```
Nombre del producto: Ordenador portátil
Precio original: 1500.0 €
Descuento: 20.0%
Precio final con descuento: 1200.0 €
```

---
