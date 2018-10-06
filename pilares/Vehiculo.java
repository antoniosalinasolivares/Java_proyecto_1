/**
*	Define un vehículo
*/
public class Vehiculo {
  protected int ruedas;
  protected boolean usaGas;
  /**
  *	define el numero de ruedas y si usa gas
  */
  public Vehiculo(int ruedas, boolean usaGas){
    this.ruedas = ruedas;
    this.usaGas = usaGas;
  }
  /**
  *	retorna el numero de ruedas
  */
  public int getRuedas(){
    return this.ruedas;
  }
  /**
  *	retorna si usa gas
  */
  public boolean getUsaGas(){
    return this.usaGas;
  }
  /**
  *	asigna un nuevo valor a las ruedas
  */
  public void setRuedas(int ruedas){
    this.ruedas = ruedas;
  }
  /**
  *	redefine si usa usa gas
  */
  public void setUsaGas(boolean usaGas){
    this.usaGas = usaGas;
  }
  /**
  *	va
  */
  public void ir(){
    System.out.println("ruuuuuuuuuuuuuuuun");
  }
}
