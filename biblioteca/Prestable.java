package biblioteca;

public interface Prestable {

	public static void prestar() {
		if (Libros.isPrestado() == false) {
			System.out.println("Te presto el libro");
		}
	}
	
	public static void devolver() {		
		if(Libros.isPrestado() == true) {
			System.out.println("Gravias por devolver el libro");
		}		
	}
	
}
