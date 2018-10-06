/**
*	define un triciclo
*/
public class Triciclo extends Vehiculo{
  public Triciclo(){
    super(3, false);
  }
  /**
  *	va
  */
  @Override
  public void ir(){
    System.out.println("A-PA-CHE, apache, DUBA DUBA DUBA DUBA DUBA");
  }
}
