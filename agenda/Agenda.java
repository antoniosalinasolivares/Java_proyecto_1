package agenda;
import java.util.ArrayList;
import java.util.Scanner;
/**
*	Esta clase proporciona elementos para crear una agenda con CRUD
*/
public class Agenda{
	private static ArrayList<String> nombres = new ArrayList<String>();
	private static ArrayList<String> telefonos = new ArrayList<String>();
	private static ArrayList<String> mascotas = new ArrayList<String>();
	/**
	*	Solicita el nombre del contacto
	*/
	public void pedirNombre(){
		System.out.print("Ingresa el nombre del contacto: ");
		Scanner sc = new Scanner(System.in);
		nombres.add(sc.nextLine());
		System.out.println("");
	}
	/**
	*	Solicita el numero telefonico
	*/
	public void pedirTelefono(){
		System.out.print("Ingresa el telefono de tu contacto: ");
		Scanner sc = new Scanner(System.in);
		telefonos.add(sc.nextLine());
		System.out.println("");
	}
	/**
	*	Solicita los datos para incluir a una mascota
	*/
	public void pedirMascota(){
		System.out.print("Ingresa el nombre de la mascota de tu contacto: ");
		Scanner sc = new Scanner(System.in);
		mascotas.add(sc.nextLine());
		System.out.println("");
	}

	/**
	*Este metodo elimina el elemento indicado por el usuario de la agenda.
	*/
	public void eliminarElemento(Agenda pruebaAgenda){
		System.out.print("Proporciona el número de contacto que quieres eliminar: ");
		Scanner eliminarnumero = new Scanner(System.in);
		int indiceadios = eliminarnumero.nextInt();
		pruebaAgenda.telefonos.remove(indiceadios - 1);
		pruebaAgenda.mascotas.remove(indiceadios - 1);
		pruebaAgenda.nombres.remove(indiceadios - 1);
	}

/**
*Metodo usado para buscar un contacto especifico, segun su nombre, su numero telefonico o el nombre de su mascota.
*/
	public void buscarContacto(Agenda pruebaAgenda){
		System.out.println("¿Cómo quieres buscar tu contacto?");
		System.out.println("1) Por nombre.\n2) Por teĺéfono.\n3) Por el nombre de su mascota.");
		Scanner busqueda = new Scanner(System.in);
		int aBuscar = busqueda.nextInt();
		switch (aBuscar) {
			case 1:
				try{
					Scanner searchName = new Scanner(System.in);
					System.out.print("Ingresa el nombre de tu contacto: ");
					int i = nombres.indexOf(searchName.nextLine()); //dice el índice del elemento según su coincidencia con la cadena ingresada
					System.out.println("");
					System.out.println((i+1)+".- Nombre: "+nombres.get(i)+" - "+" Teléfono: "+telefonos.get(i)+" -  Mascota: "+mascotas.get(i)+"\n");
				}catch(Exception e){
					System.out.println("No hay coincidencias en tu búsqueda :/\n");
				}
				break;
			case 2:
				try{
					Scanner searchPhone = new Scanner(System.in);
					System.out.print("Ingresa el teléfono de tu contacto: ");
					int i = telefonos.indexOf(searchPhone.nextLine()); //dice el índice del elemento según su coincidencia con la cadena ingresada
					System.out.println("");
					System.out.println((i+1)+".- Nombre: "+nombres.get(i)+" - "+" Teléfono: "+telefonos.get(i)+" - Mascota: "+mascotas.get(i)+"\n");
				}catch(Exception e){
					System.out.println("No hay coincidencias en tu búsqueda :/\n");
				}
				break;
			case 3:
				try{
					Scanner searchMascota = new Scanner(System.in);
					System.out.print("Ingresa el nombre de tu mascota: ");
					int i = mascotas.indexOf(searchMascota.nextLine()); //dice el índice del elemento según su coincidencia con la cadena ingresada
					System.out.println("");
					System.out.println((i+1)+".- Nombre: "+nombres.get(i)+" - "+" Teléfono: "+telefonos.get(i)+" - Mascota: "+mascotas.get(i)+"\n");
				}catch(Exception e){
					System.out.println("No hay coincidencias en tu búsqueda :/\n");
				}
				break;
		}
	}
	/**
	*	El main demuestra el funcionamiento de la clase
	*/
	public static void main(String[] args) {
		Agenda pruebaAgenda = new Agenda();
		Boolean salida = true;
		while (salida) {
			System.out.println("¿Qué acción deseas realizar en tu agenda?");
			System.out.println("1) Añadir \n2) Borrar \n3) Buscar \n4) Limpiar agenda (alch todo)\n5) enlistar\n6) Salir");
			Scanner decision = new Scanner(System.in);
			int caso = decision.nextInt();
			switch (caso){
				case 1:
					pruebaAgenda.pedirNombre();
					pruebaAgenda.pedirTelefono();
					pruebaAgenda.pedirMascota();
					break;
				case 2:
					pruebaAgenda.eliminarElemento(pruebaAgenda);
					System.out.println("");
					break;
				case 3:
					pruebaAgenda.buscarContacto(pruebaAgenda);
					break;
				case 4:
					pruebaAgenda.nombres.clear();
					pruebaAgenda.mascotas.clear();
					pruebaAgenda.telefonos.clear();
					break;
				case 5:
					System.out.println("");
					for (int i = 0;i < nombres.size();i++ ) {
						System.out.print((i+1)+".- Nombre: "+nombres.get(i)+" - "+" Telefono: "+telefonos.get(i)+" - Mascota: "+mascotas.get(i));
						System.out.println("");
					}
					System.out.println("");
					break;
				case 6:
					salida = false;
					break;
			}
		}
	}
}
