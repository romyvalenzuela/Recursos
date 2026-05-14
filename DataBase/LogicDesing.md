# Tarea E.1 - Base de Datos

## Apuntes de la clase

** 1. ¿Que es una base de datos?**

![Tabla Mascota](./ApuntesBaseDeDatosMascota.jpg)
![Modelo Entidad Relación](./ApuntesModeloEntidadRelación.jpg)

Una base de datos es un lugar organizado donde guardo información para poder buscarla, modificarla y guardarla sin perderla.
Es como una tabla donde pongo datos de cosas.
Me sirve para no perder la información.

** 2. ¿Por qué en el ejemplo visto en clases es mejor usar float a cambio de int en el ingreso del campo edad?**

En mejor usar FLOAT porque permite guardar decimales. En el ejemplo de clases usamos 0.5 para un cachorro de 6 meses. Con int solo podriamos poner 0 o 1 y se perderia el dato exacto.

** 3. ¿Por qué ingresar edad en un sistema de base de datos no es recomendable y cual sería una mejor opción?**

No es recomendable guardarla directamente porque la edad cambia cada año y el dato queda desactualizado. La mejor opción es guardar la fecha de nacimiento con tipo Date y calcular la edad cuando se necesita.

** 4. "Data vs "Realidad": Si guardampo 0.5 en FLOAT y no la fecha de nacimiento , ¿Qué problema técnico tendríamos?**

El problema es que el sistema no sabría qué día es el cumpleaños real. Solo sabría que tiene 0.5 años hoy pero no la fecha exacta para mandar el saludo de "Feliz Cumpleaños" el día correcto cada año.

** Etapa 2. Cardinalidad

¿Qué es la cardinalidad?

La cardinalidad me dice cuantos regitros de una tabla se relacionan con cuantos registros de otra tabla

Ejemplo 1: Cafateria y Pedidos - Relacion 1 a Muchos
Situacion: Una cafeteria llamada Cafe Pixel.
Un cliente puede hacer muchos pedidos,pero un pedido es solo de un cliente.
Juan puede pedir 3 cafes en la semana. Esos 3 pedidos son de Juan.

Ejemplo 2: Jugadores y Juegos - Relacion muchos a muchos
Situacion: Una app de juegos llamada GameZone.
Un jugador puede jugar muchos juegos, y un juego lo juegan muchos jugadores.
Ana juega Minecraft y FIFA. pero Minecraft tambien lo Juegan Luis y Pedro.

Diferencia de notacion
La notacion clasica usa 1:1,1:N,N:M
La notacion de minimos y maximos usa 0..1,1..N
para decir si la relacion es obligatoria o no.
