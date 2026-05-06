public class PersonajeHerencia {

  public static void main(String[] args) {
    //Instancias iguales a tu Python
    Guerrero arquero = new Guerrero("Robin Hood", 90, 20, 8);
    Personaje maravilla = new Personaje("Maravilla mala", 100, 15);

    System.out.println(" === inicio combate ===");
    arquero.defender();
    arquero.atacar(maravilla);
    maravilla.atacar(arquero);

    if (arquero.esta_vivo()) {
        System.out.println(arquero.getNombre() + "ganó");
    } else {
        System.out.println(maravilla.getNombre() + "ganó");
    }

  }

}

// Clase Padre 
class Personaje {
  private String nombre;
  private int vida;
  private int ataque;

  public Personaje(String nombre, int vida, int ataque) {
    this.nombre = nombre;
    this.vida = vida;
    this.ataque = ataque;
}

  public void atacar(Personaje otro) {
    System.out.printLn(this.nombre + "ataca a " + otro.nombre);
    otro.vida -= this.ataque;
    System.out.printLn(otro.nombre + "queda con" + otro.vida + "de vida");
}

  public boolean esta_vivo() {
    return this.vida > 0;
  }

  public String getNombre() {
    return this.nombre;
  }

}

//Clase Hija con Herencia 
class Guerrero extends Personaje {
  private int armadura;

  public Guerrero(String nombre, int vida, int ataque, int armadura) {
    super(nombre, vida, ataque); 
    this.armadura = armadura;
  }

  public void defender() {
    System.out.printLn(getNombre() + " se defiende y gana " + this.armadura + " vida ");

  }
}

}


  
  
    
