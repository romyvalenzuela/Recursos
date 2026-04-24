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

## Herencia

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
