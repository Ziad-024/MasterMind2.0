package MasterMind2_0;

import java.util.Random;
import java.util.Scanner;

public class MasterMind2_0 {

	public static void main(String[] args) {

		int wit = 7;
		int zwart = 8;
		int none = 0;
		Scanner sc = new Scanner(System.in);
		int[] kleuren = { 1, 2, 3, 4, 5, 6 };
		Random rand = new Random();

		int code1 = rand.nextInt(6);
		int code2 = rand.nextInt(6);
		int code3 = rand.nextInt(6);
		int code4 = rand.nextInt(6);
		int[] codes = { kleuren[code1], kleuren[code2], kleuren[code3], kleuren[code4] };

		System.out.print("De code: x x x x ");
		for (int a : codes) {
			
		}


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

			int[] hintposities = new int[4];

			if (antwoordcodes[0] == codes[0]) {
				hintposities[0] = zwart;
			}

			else if (antwoordcodes[0] == codes[1+2+3]) {
				hintposities[0] = wit;
			}

//			else if (antwoordcodes[0] == codes[2]) {
//				hintposities[0] = wit;
//
//			} else if (antwoordcodes[0] == codes[3]) {
//				hintposities[0] = wit;
//
//			} else
//				hintposities[0] = none;
//
//			if (antwoordcodes[1] == codes[1]) {
//				hintposities[1] = zwart;
//			}
//
//			else if (antwoordcodes[1] == codes[2]) {
//				hintposities[1] = wit;
//			}
//
//			else if (antwoordcodes[1] == codes[3]) {
//				hintposities[1] = wit;
//
//			}

			else
				hintposities[1] = none;

			if (antwoordcodes[2] == codes[2]) {
				hintposities[2] = zwart;
			}

			else if (antwoordcodes[2] == codes[3]) {
				hintposities[2] = wit;
			}

			else
				hintposities[2] = none;

			if (antwoordcodes[3] == codes[3]) {
				hintposities[3] = zwart;
			}

			else
				hintposities[3] = none;

			int hintpostitiesGoed = hintposities[0] & hintposities[1] & hintposities[2] & hintposities[3];

			if (hintpostitiesGoed == zwart) {
				System.out.println("Gefeliciteerd!");
				break;
			} else
				System.out.println("fout!");

			System.out.print("hint: ");
			for (int a : hintposities) {
				System.out.print(a + " ");
			}


			System.out.println("De code was" + codes);
		} while (rij < 1);

	}

}
