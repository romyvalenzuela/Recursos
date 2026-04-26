# CLASES PYTHON

## E4.01 Clase Personaje

Esta clase representa un personaje de videojuego.

**Código completo:** [personaje.py](./personaje.py)

## E4.02 Encapsulación

La encapsulación en Python es ocultar los atributos de una clase para que no se modifiquen directamente desde afuera.
**Código completo: [personaje_encapsulado.py](./personaje_encapsulado.py)**

### Preguntas:
**¿Cómo se encapsula código en Python?**
Se encapsula poniendo doble guion bajo __ antes del nombre del atributo. Ejemplo: self.__vida. Esto lo hace privado y solo se puede acceder desde dentro de la clase.

**¿Para qué se usan los métodos get y set en el código?**
Los métodos get sirven para leer el valor de un atributo privado, como get_vida(). Los métodos set sirven para cambiar el valor de forma controlada, como set_vida(). Así evitamos que pongan valores incorrectos como vida negativa.

**¿Se puede acceder a los métodos o atributos una vez encapsulados?Justifique**
A los atributos privados con __no se puede acceder directamente desde afuera de la clase. Si intentas heroe.__vida da error. Solo se puede usando los métodos get y set que la clase ofrece. Esto protege los datos y evita que se modifiquen por accidente.

## E4.03 Herencia

**¿Por qué cuando se crea la clase guerrero al inicio heredando de la clase personaje genera error el código?**
Genera error porque la clase guerrero hereda de personaje pero no tiene un método __init__. Al crear un guerrero , Python busca el __init__ de guerrero, no lo encuentra , y usa el personaje. Si no le pasamos los paramétros que pide el __init__ de personaje, da error.

**¿Cuándo en el video se menciona la super clase a qué se refiere?**
La super clase es la clase padre o clase base de la cual se hereda. En este caso, personaje es la super clase de guerrero. Guerrero es la subclase que hereda atributos y métodos de personaje.

**¿Para qué se usa la intrucción pass en Python?Investigue**
La instrucción pass se usa cuando Python requiere sintaxis pero no queremos ejecutar nada. Sirve como marcador de posición en clases o funciones vacías para evitar errores. Ejemplo: class Guerrero(Personaje): pass

**¿Qué es la función integrada super y para qué se usa, qué beneficio aporta?**
La función super() sirve para llamar a métodos de la clase padre desde la clase hija. Se usa principalmente en el __init__ para inicializar los atributos heredados. El beneficio es que no repetimos código y si la clase padre cambia, la hija se actualiza sola.

**¿En el video se menciona la herencia múltiple a qué se refiere?**
La herencia múltiple es cuando una clase hija hereda de dos o más clases padres al mismo tiempo. Ejemplo: class GuerreroMago(Personaje, Mago): Así la clase tiene atributos y métodos de ambas clases padres.

**¿Cuál es el beneficio de aplicar herencia en POO?**
El beneficio principal es reutilizar código. No tenemos que escribir los mismos atributos y métodos en cada clase. También organiza mejor el código: las clases hijas son versiones especializadas de la clase padre, lo que hace el programa más fácil de mantener y escalar.


## E4.04 Polimorfismo

 1.**¿Para qué se usa el polimorfismo?**
Para que objetos de distintas clases respondan al mismo método de formas diferentes. Me deja usar personaje.atacar() y que un Mago, Guerrero o Arquero ataquen distinto sin cambiar mi código.

2.**¿En el método daño(self, enemigo) qué deberíamos hacer si la fuerza es menor a la defensa?**
Si la fuerza es menor que la defensa, el daño debe ser 0 o 1 como mínimo para que el ataque no suma vida. Así evito que salgan números negativos.

3.**¿Qué métodos se crean en el paquete de personaje?**
Los métodos básicos: constructor para iniciar atributos, getters y setters para leer y cambiar datos, y métodos como atacar o defender que después cada clase hija puede redefinir con polimorfismo.

** Ejemplo de código inventado:**
```python

class Vehiculo:
def mover(self):
    print("El vehiculo se desplaza")

class Auto(Vehiculo):
def mover(self):
    print("El auto acelera por la carretera")

class Barco(Vehiculo):
def mover(self):
    print("El barco navega por el mar")

# Polimorfismo en acción
flota = [Auto(), Barco()]
for v in flota:
    v.mover() # Mismo método, resultado distinto.
```
## E5.01 Proyecto Final de class - Mascota Virtual
El proyecto consiste en crear una class `Mascota` con atributos y métodos que simulan el comportamiento de una mascota virtual.

**Código completo en:** `mascota_practica.py`

**Requisitos cumplidos:**
- Contructor `__init__` con 2 argumentos: `nombre` y `edad`
- Atributos:`nombre`, `edad`, `hambre`, `felicidad`
- Métodos: `alimentar()`, `jugar()`, `estado()`
- Control de limites con  `max()` y `min()` para que no pasen de 0-100

**Salida del programa:**
