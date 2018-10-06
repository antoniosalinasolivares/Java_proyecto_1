import java.util.Scanner;
/**
*	Esta clase crea objetos del tipo numero irracional, y los reduce a su minima expresion de forma automática
*/
public class Fraccion{
  public int denominador;
  public int numerador;

  /**
  *	El constructor toma el numerador y denominador
  */
  public Fraccion(int numerador, int denominador){
    this.numerador = numerador;
    this.denominador = denominador;
    this.reducir();
  }
  /**
  *	Encuentra el comun denominador mas grande y reduce ambos numeros
  */
  private void reducir(){
      for (int i = 2 ; i < this.denominador && i < this.numerador ; i++) {
        while(this.denominador%i == 0 && this.numerador%i == 0 ){
          this.denominador = this.denominador/i;
          this.numerador = this.numerador/i;
        }
      }
  }
  /**
  *	retorna el quebrado en su forma a/b
  */
  @Override
  public String toString(){
    return this.numerador + "/" + this.denominador;
  }
  /**
  *	prueba su funcionamiento
  */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Numerador: ");
    int num = sc.nextInt();
    System.out.println("Denominador: ");
    int den = sc.nextInt();
    Fraccion fr = new Fraccion(num, den);
    System.out.println(fr);


  }
}
