class Gato:
  def __init__(self, nombre, color):
    self.nombre = nombre
    self.color = color

  def maullar(self):
    return f"{self.nombre} dice: Miau!"

mi_gato = Gato ("Michi","naranja")
print(mi_gato.maullar())
    
    
