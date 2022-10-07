package biblioteca;

public class Articulos {

	private int codigo;
	private String title;
	private int year;
	
	public Articulos(int codigo, String title, int year) {
		super();
		this.codigo = codigo;
		this.title = title;
		this.year = year;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}
	
}
