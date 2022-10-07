package biblioteca;

public class Revistas extends Articulos {

	private int number;

	public Revistas(int codigo, String title, int year, int number) {
		super(codigo, title, year);
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
