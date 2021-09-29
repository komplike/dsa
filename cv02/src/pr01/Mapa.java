package pr01;

import java.util.Vector;

public class Mapa {
private Vector<Auto> Auta = new Vector<>();
	
	public void pridajAuto(Auto auto) {
		Auta.add(auto);
	}
	public Vector<Auto> getAuta() {
		return Auta;
	}
	public Auto getAuto(int index) {
		return Auta.elementAt(index);
	}
	public void odstranAuto(int index) {
		Auta.remove(index);
	}

	public int getPocetAut() {
		return Auta.size();
	}
}
