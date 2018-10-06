public class Carnivoro implements Animal {

  protected String comidaFavorita;
  public String getComidaFavorita(){return this.comidaFavorita;}
  public void setComidaFavorita(String comida){this.comidaFavorita = comida;}
  public void come(Animal comida){
    System.out.println("Yummy "+comida.getClass().getSimpleName() +".");
  }
  public void come(String comida){
    System.out.println("Si no es un animal no me lo como, que perro asco ser vegano.");
  }

  public void come(){
    System.out.println("Como "+ this.comidaFavorita + " porque es mi fab, we");
  }
}
