import java.util.Scanner;
/**
*	el main solo pide el numero de intentos que se quieren hacer en el uso de la clase dados
*/
public class main_dados{
  public static void main(String[] args) {
    Dados dado =  new Dados();
    Scanner kbrd = new Scanner(System.in);
    System.out.print("Introduce el numero de pruebas:");
    dado.prueba(kbrd.nextInt());
    dado.graficar();
    }
}
