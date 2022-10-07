package biblioteca;

public class Libros extends Articulos implements Prestable {
	
	private static boolean prestado = false;

	public Libros(int codigo, String title, int year, boolean prestado) {
		super(codigo, title, year);
		this.prestado = prestado;
	}

	public static boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public static void prestar() {
		// TODO Auto-generated method stub
		
	}

	public static void devolver() {
		// TODO Auto-generated method stub
		
	}


}
