/**
*Clase Reptil: para representar reptiles. Hereda atributos y metodos de la clase Animal.
*/
public class Reptil extends Animal {
	String marinoOTerrestre;
	
	/**
*Constructor de la clase Reptil
	*/
	public Reptil(int tamano, String color, String colorOjos,String nombre,String marinoOTerrestre){

		super(new Escamas(),tamano,color,new Ojos(colorOjos, 2),nombre);
		this.marinoOTerrestre = marinoOTerrestre;
	}


/**
*Implementacion del metodo abstracto avanzar() para un objeto de la clase Reptil
*/
	public void avanzar(){
		System.out.println("Repto a mi destino");
	}

/**
*Metodo digestion, describe un poco como es la digestion de un Reptil comparada con la de un Mamifero.
*/
	public void digestion(){
		System.out.println("Mi digestión es más lenta que la de los mamíferos 3:");
	}

			/**
*Sobreescritura del método toString para los Reptiles.
*/
	public String toString(){
		return "Piel: "+this.piel+"\nTamaño: "+this.tamano+"\nColor: "+this.color+"\nOjos: "+this.ojos+"\nNombre: "+this.nombre+"\n¿Marino o terrestre?: "+this.marinoOTerrestre;
	}

	/**
*Metodo equals(Object o) para Reptiles
*/
	public boolean equals(Object o){
		if (!(o instanceof Reptil)){
			return false;
		} 	
		Reptil animalito = (Reptil)o;
		return this.piel.equals(animalito.piel)&&this.tamano == animalito.tamano &&this.color.equals(animalito.color)&&this.ojos.equals(animalito.ojos)&&this.nombre.equals(animalito.nombre)&&this.marinoOTerrestre.equals(animalito.marinoOTerrestre);
	}

}