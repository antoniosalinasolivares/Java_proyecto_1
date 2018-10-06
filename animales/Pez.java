
/**
*Clase Pez: para representar peces. Hereda atributos y metodos de la clase Animal.
*/
public class Pez extends Animal {
	String aguaDulceOAguaSalada; //atributo implementado para el ejercicio 16

/**
*Metodo constructor de pez
*/
	public Pez(int tamano, String color, String colorOjos,String nombre, String aguaDulceOAguaSalada){
		super(new Escamas(),tamano,color,new Ojos(colorOjos,2),nombre);
		this.aguaDulceOAguaSalada = aguaDulceOAguaSalada;
	}

/**
*Metodo hecho en clase, describe como avanza un Pez
*/
	public void avanzar(){
		System.out.println("Nado a mi destino.");
	}

	/**
*Metodo implementado: formacion de bancos de peces
	*/
	public void agrupacionEnBanco(){
		System.out.println("¡Me agrupo en bancos con mis amigos peces!");
	}

		/**
*Sobreescritura del método toString para los peces.
*/
	public String toString(){
		return "Piel: "+this.piel+"\nTamaño: "+this.tamano+"\nColor: "+this.color+"\nOjos: "+this.ojos+"\nNombre: "+this.nombre+"\n¿De agua dulce o de agua salada?: "+this.aguaDulceOAguaSalada;
	}

	
	/**
*Metodo equals(Object o) para Mamifero
*/
	public boolean equals(Object o){
		if (!(o instanceof Pez)){
			return false;
		} 	
		Pez animalito = (Pez)o;
		return this.piel.equals(animalito.piel)&&this.tamano == animalito.tamano &&this.color.equals(animalito.color)&&this.ojos.equals(animalito.ojos)&&this.nombre.equals(animalito.nombre)&&this.aguaDulceOAguaSalada.equals(animalito.aguaDulceOAguaSalada);
	}

}