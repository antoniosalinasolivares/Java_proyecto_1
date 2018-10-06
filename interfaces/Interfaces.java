/**
*	demuestra la implementacion de comestible
*/
public class Interfaces{
  public static void main(String[] args) {
    Llanta llanta = new Llanta(139);
    llanta.rodar();
    llanta.nutre();

    Chilaquiles chilq = new Chilaquiles(600, true);
    chilq.tienePollito();
    chilq.nutre();

    Hamburguesa whopper = new Hamburguesa(1000);
    whopper.tieneQueso();
    whopper.nutre();
  }
}
