import java.util.Scanner;

public class Rombo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame un número entero para hacer un rombo con asteriscos: ");
		int n = sc.nextInt();
		System.out.println("\n");
		int contadorR = 1;
		while (contadorR <= n) {
			int espacios = n-contadorR;
			int contador = 0;
			while (espacios>0) {
				System.out.print(" ");
				espacios--;
			}

			while (contador<contadorR) {
				System.out.print("* ");
				contador++;
			}
			System.out.println(" ");
			contadorR++;
		}

		contadorR--;
		contadorR--;

		int renglonParteDeAbajoDelRombo = 1;
		while (renglonParteDeAbajoDelRombo < n ) {
			int espacios = renglonParteDeAbajoDelRombo;
			int contador = 0;
			int contador2 =0;
			while (contador<renglonParteDeAbajoDelRombo) {
				System.out.print(" ");
				contador++;
			}
			int contadorAst = n- renglonParteDeAbajoDelRombo;
			while (contador2<contadorAst) {
				System.out.print("* ");
				contador2++;
			}
			System.out.println(" ");
			renglonParteDeAbajoDelRombo++;
		}

		System.out.println("\n");
	}
}
