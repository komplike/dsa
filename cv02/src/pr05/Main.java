package pr05;

public class Main {
	public static void main(String[] args) {
		HraciPole pole = new HraciPole();
		// posun 0-hore, 1-dolu, 2-vpravo, 3-vlavo
		pole.vypisPole();
		pole.posun(0);
		pole.vypisPole();
		pole.posun(3);
		pole.vypisPole();
	}
}
