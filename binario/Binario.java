package binario;
import java.util.Scanner;
import java.util.ArrayList;
/**
*	Esta clase define un numero de tipo binario, que se construye a partir de un decimal
*/
public class Binario{

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    ArrayList<Integer> inputs = new ArrayList<Integer>();

    System.out.println("Introduce los valores del charco, separados por un espacio, \n para terminar introduce algun caracter no numerico:");
    while (in.hasNextInt()) {
      inputs.add(in.nextInt());
    }

    ArrayList<Binario> binarios = new ArrayList<Binario>();
    for (Integer x :inputs ) {
      binarios.add(new Binario(x));
    }
    for(int i = 0; i <= Binario.max ; i++){
      System.out.print(i + "'1's: ");
      for (Binario x : binarios ) {
        if (x.ones == i) {
          System.out.print(x+ ",");
        }
      }
      System.out.print("\n");
    }
  }

  public String number;
  public Integer ones;
  private static Integer max = 0;
  /**
  *	El constructor toma un numero decimal y lo convierte a binario
  * cuenta los unos que tiene el binario y los asigna a un atributo ones
  */
  public Binario(Integer decimal){
    this.number = "";
    this.ones = 0;

    if(decimal != 0){while(decimal != 1 && decimal != 0){
      this.number += Integer.toString(decimal%2);
      this.ones += (decimal%2==1)?1:0;
      decimal = decimal/2;
    }

    if (decimal ==1 ) {
      this.number += "1";
      this.ones += 1;
    }}
    else{
      this.ones = 0;
      this.number = "0";
    }
    Binario.max = Binario.max<this.ones?this.ones:Binario.max;
    this.number = new StringBuilder(this.number).reverse().toString();
  }
  /**
  *	retorna el valor binario de nuestro numero en cadenita, como la de carmen xd
  */
  public String toString(){
    return this.number;
  }

}
