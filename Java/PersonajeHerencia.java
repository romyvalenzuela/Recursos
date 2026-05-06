public class PersonajeHerencia {

  public static void main(String[] args) {
    //Instancias iguales a tu Python
    Guerrero arquero = new Guerrero("Robin Hood", 90, 20, 8);
    Personaje maravilla = new Personaje("Maravilla mala", 100, 15);

    System.out.println(" === inicio combate ===");
    arquero.defender();
    arquero.atacar(maravilla);
    maravilla.atacar(arquero);

    if (arquero.esta_Vivo()) {
        System.out.println(arquero.getNombre() + "ganó");
    } else {
        System.out.println(maravilla.getNombre() + "ganó");
    }

  }

}

// Clase Base 
class Personaje {
  private String nombre;
  private int vida;
  private int ataque;

  public Personaje(String nombre, int vida, int ataque) {
    this.nombre = nombre;
    this.vida = vida;
    this.ataque = ataque;

  }

  public void atacar(Personaje otroPersonaje) {
    otroPersonaje.vida = otroPersonaje.vida - this.ataque;
    System.out.println(this.nombre + "ataca a " + otroPersonaje.nombre);
    System.out.println("Vida de " + otroPersonaje.nombre + ":" + otroPersonaje.vida);
  }

  public boolean estaVivo() {
    return this.vida > 0;
  }

  public String getNombre() { return nombre; }
  public int getVida() { retutn vida; }
  }

//Clase hija - Herencia 
class Guerrero extends Personaje { 
  private int defensa;

  public Guerrero(String nombre, int vida, int ataque, int defensa) {
  }

  public void defender() {
    System.out.prinln(this.nombre + " se defiende. Defensa: " + this.defensa);
  }

  public void atacar(Personaje otroPersonaje) {
    int danio = this.ataque; //Podria restar defensa del otro si quiere
    otroPersonaje.vida = otroPersonaje.vida - danio;
    System.out.println(this.nombre + " ataca en furia a " + otroPersonaje.nombre);
    System.out.println(" Vida de " + otroPersonaje + ":" + otroPersonaje.getvida());
  }
}

  
 



  
  
    
