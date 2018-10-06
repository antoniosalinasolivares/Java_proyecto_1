public class Producto {
  public String nombre;
  private int precio;
  public Producto(String nombre, int precio){
    this.nombre = nombre;
    this.precio = precio;
  }
  public int getPrecio(){
    return this.precio;
  }


  public String toString(){
    return ("[ " + this.nombre + " - " + this.precio + "]");
  }
}
