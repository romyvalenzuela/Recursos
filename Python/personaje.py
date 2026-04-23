class Personaje:
  def __init__(self, nombre, vida, ataque):
    self.nombre = nombre
    self.vida = vida
    self.ataque = ataque
    def atacar(self, otro_personaje):
     otro_personaje.vida = otro_personaje.vida - self.ataque
     print(f"{self.nombre} ataca a {otro_personaje.nombre}")
     print(f"Vida de {otro_personaje.nombre}:{otro_personaje.vida}")

# Ejemplo de uso
heroe = Personaje("Link" , 100, 15)
villano = Personaje("Ganon" ,120, 10)

heroe.atacar(villano)
