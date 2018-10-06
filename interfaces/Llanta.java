/**
*	define como funciona una llanat y su contenido calorico
*/
public class Llanta implements Comestible{
  public int calorias;
  public Llanta(int calorias){
    this.calorias = calorias;
  }
  /**
  *	rueda ruedaaaaa
  */
  public void rodar(){
    System.out.println("Rueda ruedaaaaaaa!");
  }
  /**
  *	retorna su valor calórico
  */
  public void nutre(){
    System.out.println("Estoy nutriendo con: "+this.calorias);
  }
}
