package pr05;


public class HraciPole {
	private int[][] pole = new int[][] {{2,5,8},{4,1,6},{3,7,0}};
	private int[] prazdne = new int[] {2,2};
	private int tah = 1;
	
	public void vypisPole() {
		System.out.println("Tah: "+tah);
		for (int[] is : pole) {
			for (int i : is) {
				System.out.print(i+", ");
			}
			System.out.println();
		}
	}
	
	public void posun(int smer) {
		
		boolean invalid = false;
		switch (smer) {
		case 0:
			if (prazdne[0]-1 < 0)
				invalid = true;
			break;
		case 1:
			if (prazdne[0]+1 > 2)
				invalid = true;
			break;
		case 2:
			if (prazdne[1]+1 > 2)
				invalid = true;
			break;
		case 3:
			if (prazdne[1]-1 < 0)
				invalid = true;
			break;

		default:
			break;
		}
		if (invalid) {
			System.out.println("Neplatny tah!");
			return;
		}
		tah++;
		switch (smer) {
		case 0: //hore
			pole[prazdne[0]][prazdne[1]] = pole[prazdne[0]-1][prazdne[1]];
			pole[prazdne[0]-1][prazdne[1]] = 0;
			prazdne[0] = prazdne[0]-1;
			break;
		case 1: //dole
			pole[prazdne[0]][prazdne[1]] = pole[prazdne[0]+1][prazdne[1]];
			pole[prazdne[0]+1][prazdne[1]] = 0;
			prazdne[0] = prazdne[0]+1;
			break;
		case 2:  //vpravo
			pole[prazdne[0]][prazdne[1]] = pole[prazdne[0]][prazdne[1]+1];
			pole[prazdne[0]][prazdne[1]+1] = 0;
			prazdne[1] = prazdne[1]-1;
			break;
		case 3: //vlavo
			pole[prazdne[0]][prazdne[1]] = pole[prazdne[0]][prazdne[1]-1];
			pole[prazdne[0]][prazdne[1]-1] = 0;
			prazdne[1] = prazdne[1]+1;
			break;
		default:
			break;
		}
	}
}
