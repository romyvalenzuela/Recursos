public class Mascota {
  private String nombre;
  private int edad;
  private int hambre = 50;
  private int felicidad = 50;
  private int vida = 100;

  public Mascota(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;

  }

  // Este es el método que pide la actividad
  public boolean estaVivo() {
      if (this.vida > 0) {
         return true;
      } else {
          return false;
      }

  } 

  public int getFelicidad() {
    return this.felicidad;

  }

  public void setFelicidad(int valor) {
    this.felicidad = Math.max(0, Math.min(100, valor));

    
