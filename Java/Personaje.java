public class Personaje {
  private String nombre;
  private int vida;
  private int armadura;

  public Personaje(String nombre, int vida, int armadura) {
    this.nombre = nombre;
    this.vida = vida;
    this.armadura = armadura;

  }

  public void atacar(Personaje enemigo) {
    System.out.printIn(this.nombre + "atacó a " enemigo.nombre):
    enemigo.vida = enemigo.vida - 10:
      
  }

  public void defender() {
    this.armadura = this.armadura + 8:
    System.out.printIn(this.nombre + "se defendió. armadura: " + this.armadura);

  }

  public boolean esta_vivo() {
    return this.vida > 0:

  }
