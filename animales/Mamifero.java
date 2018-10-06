public class Mamifero extends Animal{

	int patasParaAndar; //Atributo aniadido por nosotros para la clase Mamifero
/**
*Metodo constructor de la clase Mamifero, que hereda de Animal.
*/
	public Mamifero(int tamano, String color,String colorOjos,int numOjos,String nombre,int patasParaAndar){
		super(new Pelo(), tamano, color, new Ojos(colorOjos,numOjos),nombre);
		this.patasParaAndar = patasParaAndar;
	}

	/**
*Sobreescritura del método toString para lss mamiferos.
*/
	public String toString(){
		return "Piel: "+this.piel+"\nTamaño: "+this.tamano+"\nColor: "+this.color+"\nOjos: "+this.ojos+"\nNombre: "+this.nombre+"\nPatas para andar: "+this.patasParaAndar;
	}

/**
*Metodo hecho en clase, describe como avanza un Mamifero
*/
	public void avanzar(){
		System.out.println("Camino a mi destino.");
	}

/**
*Metodo elaborado para la clase Mamifero. Los mamiferos (todos) tienen pelo, aunque sea poco.
*/
	public void tenerPelo(){
		System.out.println("Anuma, tengo pelo.");
	}

	/**
*Metodo equals(Object o) para Mamifero
*/
	public boolean equals(Object o){
		if (!(o instanceof Mamifero)){
			return false;
		} 	
		Mamifero animalito = (Mamifero)o;
		return this.piel.equals(animalito.piel)&&this.tamano == animalito.tamano &&this.color.equals(animalito.color)&&this.ojos.equals(animalito.ojos)&&this.nombre.equals(animalito.nombre)&&this.patasParaAndar==animalito.patasParaAndar;
	}
}