/**
*	La clase chilaquiles implementa comestible
*/
public class Chilaquiles implements Comestible{
  public int calorias;
  public boolean tienePollito;
  /**
  *	determina si los chilaquiles tienen pollo y cuantas calorias tiene
  */
  public Chilaquiles(int calorias, boolean tienePollito){
    this.calorias = calorias;
    this.tienePollito = tienePollito;
  }
  /**
  *	retorna el valor de si tiene pollito o no
  */
  public boolean tienePollito(){
    if (this.tienePollito) {
      System.out.println("Estos chilaquiles si tienen pollito :) ");
    }
    else {
      System.out.println("Estos chilaquiles no tiene pollito :(");
    }
    return tienePollito;
  }
  /**
  *	indica cuanto nutre
  */
  public void nutre(){
    System.out.println("Estoy nutriendo con: "+this.calorias);
  }
}
