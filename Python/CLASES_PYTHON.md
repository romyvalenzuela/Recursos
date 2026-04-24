# CLASES PYTHON

## E4.01 Clase Personaje

Esta clase representa un personaje de videojuego.

**Código completo:** [personaje.py](./personaje.py)

## E4.02 Encapsulación

La encapsulación en Python es ocultar los atributos de una clase para que no se modifiquen directamente desde afuera.
**Código completo:[personaje_encapsulado.py](./personaje_encapsulado.py)**

### Preguntas:
**¿Cómo se encapsula código en Python?**
Se encapsula poniendo doble guion bajo __ antes del nombre del atributo. Ejemplo: self.__vida. Esto lo hace privado y solo se puede acceder desde dentro de la clase.

**¿Para qué se usan los métodos get y set en el código?**
Los métodos get sirven para leer el valor de un atributo privado, como get_vida(). Los métodos set sirven para cambiar el valor de forma controlada, como set_vida(). Asi evitamos que pongan valores incorrectos como vida negativa.

**¿Se puede acceder a los métodos o atributos una vez encapsulados?Justifique**
A los atributos privados con __no se puede acceder directamente desde afuera de la clase. Si intentas heroe.__vida da error. Solo se puede usando los métodos get y set que la clase ofrece. Esto protege los datos y evita que se modifiquen por accidente.




