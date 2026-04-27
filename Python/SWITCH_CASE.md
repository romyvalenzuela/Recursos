# SWITCH_CASE en Python

Python **no tiene** un ´switch´como otros lenguajes.En su lugar se usa 'if-elif-else´ o diccionarios para simularlo


## Ejemplo con diccionario (simulando switch)

´´´python


def opcion_1():
    print("Elegiste opcion 1")


def opcion_2():
    print("Elegiste opcion 2")


def opcion_default():
    print("Opcion no valida")


opciones = {
  1: opcion_1,
  2: opcion_2
  }

 
  eleccion = 2
  opciones.get(eleccion, opcion_default)()
  
  ```
