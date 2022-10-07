package biblioteca;

public class Biblioteca {

	Articulos[] libro = new Libros[2];
	Articulos[] revista = new Revistas[2];
	
	public static void main(String[] args) {
		
		initData();
		
		System.out.println("Bienvenido a nuestra Biblioteca");

	}

	public static void initData() {
		
		Libros guardian = new Libros(54, "El guardian entre el centeno", 1960, false);
		String peticion = null;
		
		if (guardian instanceof Libros && peticion == "prestar") {
			Libros.prestar();
		} else if (guardian instanceof Libros && peticion == "devolver") {
			Libros.devolver();
		} else {
			System.out.println("Lo siento, las revistas no se prestan");
		}
	}
}
