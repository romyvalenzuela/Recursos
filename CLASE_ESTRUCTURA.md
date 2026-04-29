## Diagrama de Clases: Personaje

```mermaid
classDiagram    

    class Personaje {

         -String nombre
         -int vida
         -int armadura
         +Personaje(nombre: String, vida: int, armadura: int)
         +atacar(enemigo: Personaje): void
         +defender(): void
         +esta_vivo():boolean
