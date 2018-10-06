/**
*	Hamburguesita
*/
public class Hamburguesa implements Comestible {
  public int calorias;
  public Hamburguesa(int calorias){
    this.calorias = calorias;
  }
  /**
  *	retorna si tiene quesito
  */
  public boolean tieneQueso(){
    System.out.println("Toda Hamburguesa debe tener queso, no mames");
    return true;
  }
  /**
  *	retorna el valor calorico
  */
  public void nutre(){
    System.out.println("Estoy nutriendo con: "+this.calorias);
  }
}
