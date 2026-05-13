# Tarea E.1 - Base de Datos

## Apuntes de la clase

** 1. ¿Que es una base de datos?**
Una base de datos es un lugar organizado donde guardo información para poder buscarla, modificarla y guardarla sin perderla.
Es como una tabla donde pongo datos de cosas.
Me sirve para no perder la información.

** 2. ¿Por qué en el ejemplo visto en clases es mejor usar float a cambio de int en el ingreso del campo edad?**
En mis apuntes no veo que usemos float para edad, usamo 'int'. El float es para numeros con decimales. si usaran float para edad seria 17.5 años, pero normalmente con 'int' basta.

** 3. ¿por que ingresar edad en un sistema de base de datos no es recomendable y cual seria una mejor opcion en este caso?
No es recomendable guardar la edad directamente porque cambia cada año y queda desactualizada. En mis apuntes el campo 'fecha de nacimiento' en la tabla Mascota. La mejor opcion es guardar la fecha de nacimiento con tipo 'Date', y calcular la edad restando la fecha actual. Asi siempre esta correcto.
