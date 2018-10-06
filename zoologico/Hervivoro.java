public class Hervivoro implements Animal {
  protected String comidaFavorita;
  public String getComidaFavorita(){return this.comidaFavorita;}
  public void setComidaFavorita(String comida){this.comidaFavorita = comida;}
  public void come(String comida){
    System.out.println("Soy vegano y como: "+ comida);
  }
  public void come(Animal comida){
    System.out.println("Yo no como carne, porque soy inferior, yo como: " + comidaFavorita);
  }

  public void come(){
    System.out.println("nom " + comidaFavorita );
  }
}
