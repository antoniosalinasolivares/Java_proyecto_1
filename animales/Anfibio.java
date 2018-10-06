/**
*Case Anfibio sirve para crear Anfibios, clase heredera de Animal.
*/
public class Anfibio extends Animal{
	String especie;//atributo agregado

/**
*Metodo constructor de anfibio, recibe el tamaño, color, color de ojos, su nombre y la especie a la que pertenece
*/
	public Anfibio(int tamano,String color,String colorOjos,String nombre,String especie){
		super(new Descubierta(),tamano,color,new Ojos(colorOjos,2),nombre);
		this.especie = especie;
	}

/**
*Metodo hecho en clase, describe como avanza un Anfibio
*/
	public void avanzar(){
		System.out.println("Salto a mi destino");
	}

/**
*Metodo hecho en clase, describe que un anfibio tiene la capacidad de hacer metamorfosis.
*/
	public void metamorfosis(){
		System.out.println("Realizo metamorfosis.");
	}

/**
*Metodo aniadido por mi para la familia de los anfibios. La homeotermia es la incapacidad de los anfibios para mantener constante su temperatura corporal.
*/
	public void homeotermia(){
		System.out.println("Soy incapaz de mantener mi temperatura corporal constante.");
	}

	public String toString(){
		return "Piel: "+this.piel+"\nTamaño: "+this.tamano+"\nColor: "+this.color+"\nOjos: "+this.ojos+"\nNombre: "+this.nombre+"\nEspecie: "+this.especie;
	}

	public boolean equals(Object o){
		if (!(o instanceof Anfibio)){
			return false;
		} 	
		Anfibio animalito = (Anfibio)o;
		return this.piel.equals(animalito.piel)&&this.tamano == animalito.tamano &&this.color.equals(animalito.color)&&this.ojos.equals(animalito.ojos)&&this.nombre.equals(animalito.nombre)&&this.especie.equals(animalito.especie);
	}
	
}