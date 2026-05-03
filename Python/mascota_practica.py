class Macota:
  def __int__(self, nombre, edad):
      self.nombre = nombre
      self.edad = edad
      self.hambre = 50
      self.__felicidad = 50
      self.vida = 100

  def esta_vivo(self):
      if self.vida > 0:
         return True
      else:

         return False

  def get_felicidad(self):
      return self.__felicidad

  def set_felicidad(self, valor):
      self.__felicidad = max(0, min(100, valor))
          
    
