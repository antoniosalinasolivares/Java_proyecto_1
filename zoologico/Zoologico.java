public class Zoologico {
  public static void main(String[] args) {

      Leon bob = new Leon();
      Puma loren = new Puma();
      Tigre tonio = new Tigre();

      bob.come();
      bob.come("pito");
      loren.come();
      tonio.come("frutilupis");
      tonio.come();

      Venado ven = new Venado();
      Antilope ant = new Antilope();
      Zebra alan = new Zebra();

      ven.come();
      ant.come();
      alan.come();

      bob.come(ant);

  }
}
