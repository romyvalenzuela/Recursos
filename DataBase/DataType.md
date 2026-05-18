# Tipos de Datos en Bases de Datos Relacionales

## 1. Tipo Char 
CHAR Es un tipo de dato de **longitud fija**.
- Si define `CHART(10)`, siempre va a ocupar 10 caracteres en memoria.
- Si ingresas "Hola" que tiene 4 caracteres, la base de datos rellena los 6 espacios restantes con espacios en blanco.
Por eso es rápido para buscar, pero gasta más espacio si el texto es corto. Se usa para datos que siempre tienen la misma longitud, como códigos `CHAR(4)` o RUT sin puntos.

## 2. Tipo VARCHAR
VARCHAR Es un tipo de dato de **longitud variable**
- Si definea `VARCHAR(10)` e ingresas "Hola",solo ocupa 4 caracteres + 1 byte para guardar la longitud.
- No rellena con espacios en blanco.
Por eso es más eficiente para textos de largo variable como nombre, apellido o direcciones, porque no desperdicia espacio en memoria.

## 3. Tipo TEXT
TEXT Está diseñado para almacenar **textos largos sin límites fijos de caracteres **,
como descripciones, comentarios, artículos o el contenido de un mensaje.

## Ventajas respectoa CHAR y VARCHAR:**
- CHAR y VARCHAR tienen un limite maximo definido po ti, ej: VARCHAR(255).
- TEXT puede guardar miles de caracteres sin que tengas que definir el límite exacto.
La desventaja es que es más lento para buscar e indexar a CHAR y VARCHAR.

## 4. Análisis de caso prctico: Matrículas vehiculares
Para matrículas vehiculares que siempre tienen 7 caracteres usarías **CHAR(7)**.

**Por qué:**
- CHAR es de longitud fija, entonces siempre ocupa  7 caracteres.
- Como todas las matriculas tienen exactamente 7 caracteres, no desperdicias espacio rellenando.
- Es mas rápido para buscar e indexar que VARCHAR porque todos los registros tienen el mismo tamañano.
Usar VARCHAR(7) también funcionaría, pero CHAR(7) es más eficiente en este caso específico.

## 5. Gestión de almacenamiento: Riesgo de VARCHAR muy grande
El riesgo de definir un VARCHAR con longitud execivamente grande, ej: `VARCHAR(1000)`, cuando los datos reales son pequeños, es:

1. **Falsa sensación de seguridad**: Parece que no hay problema de espacio, pero el programador puede pensar que "no importa" y no validar el largo de entrada.
2. **Uso ineficiente de memoria en operaciones temporales**: Al hacer consultas, ordenamiento y joins, MySQL/SQL Server a veces reserva memoria según el largo máximo definido, no el largo real. Si pones VARCHAR (1000) para un nombre que tiene 10 caracteres, puedes estar gastando memoriade más.
3. **Menor control de datos**: No estas aprovechando la validación implícita que da definir un limite realista.

ConclusiónPon el lago máximo realista que vas a usar. Para un Nombre, VARCHAR(50) o VARCHAR(1000) es suficiente. 

