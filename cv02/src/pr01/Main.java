package pr01;

public class Main {
	public static void main(String[] args) {
		Mapa m = new Mapa();
		
		m.pridajAuto(new Auto("BMW",10,10));
		m.pridajAuto(new Auto("Mazda",20,10));
		m.pridajAuto(new Auto("WW",30,10));
		m.pridajAuto(new Auto("Tesla",40,10));
	
		System.out.println("Pocet aut: "+m.getPocetAut());
		for (Auto auto : m.getAuta()) {
			System.out.print(auto);
		}
	}
}
