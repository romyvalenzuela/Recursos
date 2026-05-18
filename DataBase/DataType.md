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

##Ventajas respectoa CHAR y VARCHAR:**
- CHAR y VARCHAR tienen un limite maximo definido po ti, ej: VARCHAR(255).
- TEXT puede guardar miles de caracteres sin que tengas que definir el límite exacto.
La desventaja es que es más lento para buscar e indexar a CHAR y VARCHAR.
