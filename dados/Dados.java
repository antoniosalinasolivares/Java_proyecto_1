/**
* Esta clase demuestra la distribucion campanaria de la probabilidad
* mediante el tiro de dados
*/
public class Dados{

  int resultados[];
  /**
  *	Construye un dado con sus tablas de probabilidad
  */
  public Dados(){
    this.resultados = new int[] {0,0,0,0,0,0,0,0,0,0,0};
    //                           2,3,4,5,6,7,8,9,0,1,2
    //                           0,1,2,3,4,5,6,7,8,9,1
    }
    /**
    *	tira un dado y retorna un aleatorio del 1 al 6
    */
  public static int tirar_dado(){
    return ((int)(Math.random() * 6) + 1);
  }
  /**
  *	hace range veces la prueba y modifica el arreglo
  */
  public void prueba(int range)
  {
    for (int i = 0 ; i < range ; i++ ) {
      int index = Dados.tirar_dado() + Dados.tirar_dado() -2;
      this.resultados[index]++;
    }
  }
  /**
  *	imprime en pantalla la distribucion de aciertos
  */
  public void graficar(){
    for (int i = 0 ; i < 11 ; i++ ) {
      System.out.print(i+2 + "|");
      for (int j = 1; j <= this.resultados[i] ; j++)
        System.out.print("#");
      System.out.print(this.resultados[i]);
      System.out.print("\n");
    }
  }
}
