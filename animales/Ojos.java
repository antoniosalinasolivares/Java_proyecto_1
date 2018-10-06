public class Ojos{

	private String color;

	private int cantidad;


	public Ojos(String color, int cantidad){

		this.color = color;
		this.cantidad = cantidad;

	}

	public String toString(){//es el método que se invoca cuando imprimes un objeto
		return "Color: "+this.color+" Cantidad: "+this.cantidad;
	}
	
}