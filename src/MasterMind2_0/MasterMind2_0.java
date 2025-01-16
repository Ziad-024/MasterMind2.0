package MasterMind2_0;

import java.util.Random;
import java.util.Scanner;

public class MasterMind2_0 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] kleuren = { 1, 2, 3, 4, 5, 6 };
		Random rand = new Random();

		codesFunctie func = new codesFunctie();
		int[] codes = func.codesFunctie();
		System.out.print("De code: x x x x ");

		System.out.println(" ");

		int rij = 0;

		do {
			rij++;
			System.out.println("beurt " + rij);
			System.out.println(" ");

			System.out.println("Raad de code:");
			System.out.println("kies uit rood = 1, geel = 2, groen = 3, blauw = 4, paars = 5, oranje = 6");

			int[] antwoordcodes = new int[4];

			for (int i = 0; i < antwoordcodes.length; i++) {
				String in = sc.next();
				int loopInput = Integer.parseInt(in);
				if (loopInput >= 6) {
					loopInput = 6;
				} else if (loopInput <= 1) {
					loopInput = 1;
				}
				antwoordcodes[i] = loopInput;
			}

			System.out.print("gok: ");
			for (int a : antwoordcodes) {
				System.out.print(a + " ");
			}

			System.out.println("");

			System.out.println("Hint:");

			System.out.println("");
			func.NaKijkFunction(codes, antwoordcodes);

		} while (rij < 10);
		System.out.println("de code was:");
		for (int a : codes) {

			System.out.print(a);
		}

	}

}
