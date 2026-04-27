class Personaje:
 def __init__(self, nombre, vida, ataque):
    self.nombre = nombre
    self.vida = vida
    self.ataque = ataque

 def atacar(self, otro):
    otro.vida -= self.ataque
    print(f"{self.nombre} ataó a {otro.nombre}. Vida de {otro.nombre}: {otro.vida}")

 def esta_vivo(self):
  return sel.vida > 0

class Guerrero(Personaje):
  def __init__(self, nombre, vida, ataque, armadura):
    super().__init__(nombre, vida, ataque):
    self.armadura = armadura
  
  def defender(self):
    self.vida += self. armadura
    print((f"{self.nombr} se defendio con {self.armadura} de armadura. Vida: {self.vida}")

# Personaje diferente inventado
arquero = Guerrero("Robin Hood", 90, 20, 8)
maravilla = Personaje("Maravilla mala", 100, 15)

print("=== inicio combate ===")
arquero.defiender()
arquero.atacar(maravilla)
maravilla.atacar(arquero)

if arquero.esta_vivo():
  print(f"{arquero.nombre} ganó")

else:
  print(maravilla.nombre} ganó") 


    
