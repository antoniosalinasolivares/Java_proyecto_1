import java.util.Scanner;

public class Prebemart {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int elec = 0;
    Ticket compra = new Ticket();
    do{
      System.out.println("Bienvenido a PrebeMart!");
      System.out.println("¿Qué deseas hacer?:");
      System.out.println("1)Agregar al carrito");
      System.out.println("2)Quitar del carrito");
      System.out.println("3)Terminar compra");
      elec = in.nextInt();
      switch (elec) {
        case 1:
        System.out.println("Cuando desees dejar de agregar productos, introduce una 'x'");
        String nombre = "";
        int precio;
        while(!nombre.equals("x")){
          System.out.print("Producto: ");
          nombre = in.next();
          if(!nombre.equals("x")){
            System.out.println("");
            System.out.print("Precio: ");
            precio = in.nextInt();
            compra.add(new Producto(nombre, precio));
          }


        }
        System.out.println("Tu carrito queda así:");
        int j = 0;
        for (Producto pro : compra.ticket ) {
          System.out.println((j+1) + ")" + pro.toString());
          j++;
        }
        break;
        case 2:
        System.out.println("Tu carrito:");
        int i = 0;
        for (Producto pro : compra.ticket ) {
          System.out.println((i+1) + ")" + pro.toString());
          i++;
        }
        System.out.println("Qué elemento deseas quitar? (mete el indice)");
        i = in.nextInt();
        compra.remove(i-1);
        break;

      }

    }while(elec != 3);
    int i = 0;
    for (Producto pro : compra.ticket ) {
      System.out.println((i+1) + ")" + pro.toString());
      i++;
    }
    int total = compra.end();
    System.out.println("Total de la compra: "+total );
    if(total > 500){
      System.out.println("No te alcanza");
    }




  }
}
