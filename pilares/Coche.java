/**
*	crea un coche
*/
public class Coche extends Vehiculo{
  public Coche(boolean electrico){
    super(4, !electrico);
  }
  /**
  *	va
  */
  @Override
  public void ir(){
    if(this.usaGas){
      super.ir();
    }
    else{
      System.out.println("Los coches electricos no hacen ruido!");
    }
  }
}
