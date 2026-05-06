# SINTAXIS_JAVA.md - Romy Valenzuela

## E4.05 - Tipos de datos básicos

### 1. Texto - String
```java
String nombre = "Romy";
String apellido = "Valenzuela";
System.out.println("Hola" + nombre + " " + apellido);
```
// Los String guardan texto con comillas dobles.

### 2. Números - int
```java
int edad = 25;
System.out.println("Edad: " + edad);
```
// int guarda números enteros.

### 3. Booleanos - boolean
```java
boolean estaVivo = true;
 System.out.println(estaVivo);
```
// boolean solo es true o false

## E4.06 - Estructuras de datos

### 4. HashMap - Diccionario clave-valor
```java
import java.util.HashMap;
HashMap<String, Integer> inventario = new HashMap<>();
inventario.put("Pocion" , 5);
System.out.println(inventario.get("Pocion"));
```
// HashMap guarda pares clave-valor como un diccionario.



