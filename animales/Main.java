public class Main{
	public static void main(String[] args) {
		Anfibio frog = new Anfibio(5,"verde","azul","René","Rana");
		System.out.println(frog.toString());
		frog.homeotermia();
		frog.metamorfosis();
		frog.avanzar();

		System.out.println("");

		Ave pajaro = new Ave(10,"rojo","miel","CorrecaminosBipBip",2);
		System.out.println(pajaro.toString());
		pajaro.chocarConVentanasTransparentes();
		pajaro.cazar();
		pajaro.avanzar();

		System.out.println("");

		Mamifero osito = new Mamifero(50,"café","cafés",2,"Pooh",4);
		System.out.println(osito.toString());
		osito.tenerPelo();
		osito.comer();
		osito.avanzar();

		System.out.println("");

		Pez nemo = new Pez(6,"turquesa","verdes","Nemo","Soy de agua salada");
		System.out.println(nemo.toString());
		nemo.agrupacionEnBanco();
		nemo.crecer();
		nemo.avanzar();

		System.out.println("");

		Reptil reptar = new Reptil(8,"verde","rojos","Reptar","Soy terrestre");
		System.out.println(reptar.toString());
		reptar.digestion();
		reptar.comer();
		reptar.avanzar();

		Pez dory = new Pez(6,"turquesa","verdes","Dory","Soy de agua salada");

		System.out.println(reptar.equals(osito));
		System.out.print(nemo.equals(dory));
	}


}