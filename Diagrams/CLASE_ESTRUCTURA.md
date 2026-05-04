# Diagrama UML - Clase Personaje

## Diagrama de Clases en Mermaid

```mermaid
classDiagram
    class Personaje {
         -String nombre
         -int vida
         -int ataque
         -int defensa
         +Personaje(nombre: String, vida: int, ataque: int, defensa: int)
         +esta_vivo(): boolean
         +recibir_danio(danio: int): void
         +atacar(objetivo: Personaje): void
         +getNombre(): String
         +getVida(): int
}


