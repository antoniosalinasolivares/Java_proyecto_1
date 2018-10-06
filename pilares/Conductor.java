/**
*	Crea conductroes para demostrar que los vehiculos funcionan
*/
public class Conductor {
  public static void main(String[] args) {
    Triciclo apache = new Triciclo();
    Trailer kenworth = new Trailer();
    Coche tesla = new Coche(true);

    Conductor elon = new Conductor(tesla);
    Conductor tioBeto= new Conductor(kenworth);
    Conductor timmy = new Conductor(apache);

    System.out.println("Elon manejara: ");
    elon.manejar();
    System.out.println("El tio Beto manejara: ");
    tioBeto.manejar();
    System.out.println("El pequenio timmy manejara: ");
    timmy.manejar();
  }
  /**
  *	asigna un vehiculo a cada chofer
  */
  public Conductor(Vehiculo miNave){
    this.miNave = miNave;
  }

  public Vehiculo miNave;
  /**
  *	hace que el chofer maneje su vehiculo
  */
  public void manejar(){
    System.out.println("yo manejo");
    miNave.ir();
  }

}
