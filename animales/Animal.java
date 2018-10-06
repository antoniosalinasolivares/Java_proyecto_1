public class Animal{
	Piel piel;
	int tamano;
	String color;
	Ojos ojos;
	String nombre;


	public String toString(){
		return "Piel: "+this.piel+"\nTamaño: "+this.tamano+"\nColor: "+this.color+"\nOjos: "+this.ojos+"\nNombre: "+this.nombre;
	}

	public boolean equals(Object o){
		if (!(o instanceof Animal)){
			return false;
		} 
		Animal animalito = (Animal)o;
		return this.piel.equals(animalito.piel)&&this.tamano == animalito.tamano &&this.color.equals(animalito.color)&&this.ojos.equals(animalito.ojos)&&this.nombre.equals(animalito.nombre);
	}

	public Animal(Piel piel, int tamano, String color,Ojos ojos,String nombre){//el metodo constructor no tiene var. retorno.
		this.piel = piel;
		this.tamano = tamano;
		this.color = color;
		this.ojos = ojos;
		this.nombre = nombre;
	}

	public void cazar(){
		System.out.println("Estoy cazando men");
	}

	public void comer(){
		System.out.println("Estoy comiendo");
	}

	public void crecer(){
		this.tamano += 1;
	}

	public void avanzar(){

	}

}