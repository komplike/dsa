package pr01;

public class Auto {
	private String nazov;
	private int x;
	private int y;
	
	public Auto() {
	}
	
	public Auto(String nazov, int x, int y) {
		super();
		this.nazov = nazov;
		this.x = x;
		this.y = y;
	}
	
	public String getNazov() {
		return nazov;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	@Override
	public String toString() {
		return "Nazov: "+nazov+", X: "+x+", Y: "+y+"\n";
	}
}
