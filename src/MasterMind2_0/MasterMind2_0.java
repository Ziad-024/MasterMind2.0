package MasterMind2_0;

public class MasterMind2_0 {

	public static void main(String[] args) {

		int[] kleuren = { 1, 2, 3, 4, 5, 6 };

		codesFunctie func = new codesFunctie();
		int[] codes = func.CodesFunctie1();
		System.out.print("De code: x x x x ");
		for (int a : codes) {

			System.out.print(a);
		}
		System.out.println(" ");

		int rij = 0;

		do {
			rij++;
			System.out.println("beurt " + rij);
			System.out.println(" ");

			System.out.println("Raad de code:");
			System.out.println("kies uit rood = 1, geel = 2, groen = 3, blauw = 4, paars = 5, oranje = 6");

			int[] antwoordcodes = func.Userinput();

			Boolean x = func.NaKijkFunction(codes, antwoordcodes, kleuren);
			//System.out.println(x);
			if(x == true) {
				break;
			}

		} while (rij < 10);
		System.out.println("de code was:");
		for (int a : codes) {

			System.out.print(a);
		}

	}

}
