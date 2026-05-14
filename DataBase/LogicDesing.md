# Tarea E.1 - Base de Datos

## Apuntes de la clase

![Tabla Mascota](./ApuntesBaseDeDatosMascota.jpg)
![Modelo Entidad Relación](./ApuntesModeloEntidadRelación.jpg)

** 1. ¿Qué es una base de datos?**

Una base de datos es un lugar organizado donde guardo información para poder buscarla, modificarla y guardarla sin perderla.
Es como una tabla donde pongo datos de cosas.
Me sirve para no perder la información.

** 2. ¿Por qué en el ejemplo visto en clases es mejor usar float a cambio de int en el ingreso del campo edad?**

En mejor usar FLOAT porque permite guardar decimales. En el ejemplo de clases usamos 0.5 para un cachorro de 6 meses. Con int solo podriamos poner 0 o 1 y se perderia el dato exacto.

** 3. ¿Por qué ingresar edad en un sistema de base de datos no es recomendable y cual sería una mejor opción?**

No es recomendable guardarla directamente porque la edad cambia cada año y el dato queda desactualizado. La mejor opción es guardar la fecha de nacimiento con tipo Date y calcular la edad cuando se necesita.

** 4. "Data vs "Realidad": Si guardamos 0.5 en FLOAT y no la fecha de nacimiento , ¿Qué problema técnico tendríamos?**

Si solo guardamos 0.5, perdemos la fecha exasta de nacimiento. El sistema no sabría en qué día y mes cumple el cachorro, solo sabe que tiene medio año. Entonces no podría enviar el saludo automático el día correcto cada año, porque no tiene la fecha real para calcular cuándo es el cumpleaño. Con DATE sí se puede calcular la edad y el día exacto del cumpleaños automáticamente.

## **Etapa 2. Cardinalidad**

¿Qué es la cardinalidad?

La cardinalidad me dice cuantos regitros de una tabla se relacionan con cuantos registros de otra tabla

Ejemplo 1: Cafatería y Pedidos - Relación 1 a Muchos
Situación: Una cafeteria llamada Cafe Pixel.
Un cliente puede hacer muchos pedidos,pero un pedido es solo de un cliente.
Juan puede pedir 3 cafes en la semana. Esos 3 pedidos son de Juan.

Ejemplo 2: Jugadores y Juegos - Relación muchos a muchos
Situación: Una app de juegos llamada GameZone.
Un jugador puede jugar muchos juegos, y un juego lo juegan muchos jugadores.
Ana juega Minecraft y FIFA. pero Minecraft tambien lo Juegan Luis y Pedro.

Diferencia de notacion
La notacion clasica usa 1:1,1:N,N:M
La notacion de minimos y maximos usa 0..1,1..N
para decir si la relacion es obligatoria o no.
