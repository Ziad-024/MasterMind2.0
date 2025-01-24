package MasterMind2_0;

import java.util.Random;

import java.util.Scanner;

public class codesFunctie {

	public int[] CodesFunctie1() {

		int[] kleuren = { 1, 2, 3, 4, 5, 6 };
		Random rand = new Random();

		int code1 = rand.nextInt(6);
		int code2 = rand.nextInt(6);
		int code3 = rand.nextInt(6);
		int code4 = rand.nextInt(6);
		int[] codes = { kleuren[code1], kleuren[code2], kleuren[code3], kleuren[code4] };

		return codes;

	}

	public int[] Userinput() {
		{
			Scanner sc = new Scanner(System.in);
			int[] antwoordcodes = new int[4];

			for (int i = 0; i < antwoordcodes.length; i++) {
				while (true) {
					try {
						String in = sc.next();
						int loopInput = Integer.parseInt(in);

						if (loopInput > 6 || loopInput < 1) {
							System.out.println("Fout: De waarde van het spel moet tussen 1 en 6 liggen.");
						} else {
							antwoordcodes[i] = loopInput;
							break; // exit the loop and continue with the next input
						}
					} catch (NumberFormatException e) {
						System.out.println("Fout: Voer alstublieft een geldig getal in.");
					}
				}
			}

			for (int code : antwoordcodes) {
				System.out.println(code);
			}
			return antwoordcodes;

		}

	}

	public Boolean NaKijkFunction(int[] codes, int[] antwoordcodes, int[] kleuren) {
		int[] hintposities = new int[4];
		int wit = 7;
		int zwart = 8;
		int none = 0;

		System.out.print("gok: ");
		for (int a : antwoordcodes) {
			System.out.print(a + " ");
		}

		System.out.println("");

		System.out.println("Hint:");

		System.out.println("");

		if (antwoordcodes[0] == codes[0]) {
			hintposities[0] = zwart;
		}

		else if (antwoordcodes[0] == codes[1] || antwoordcodes[0] == codes[2] || antwoordcodes[0] == codes[3]) {
			hintposities[0] = wit;
		}

		else
			hintposities[0] = none;

		if (antwoordcodes[1] == codes[1]) {
			hintposities[1] = zwart;
		}

		else if (antwoordcodes[1] == codes[2] || antwoordcodes[1] == codes[3] || antwoordcodes[1] == codes[0]) {
			hintposities[1] = wit;
		}

		else
			hintposities[1] = none;

		if (antwoordcodes[2] == codes[2]) {
			hintposities[2] = zwart;
		}

		else if (antwoordcodes[2] == codes[3] || antwoordcodes[2] == codes[1] || antwoordcodes[2] == codes[0]) {
			hintposities[2] = wit;
		}

		else
			hintposities[2] = none;

		if (antwoordcodes[3] == codes[3]) {
			hintposities[3] = zwart;
		}

		else if (antwoordcodes[3] == codes[2] || antwoordcodes[3] == codes[1] || antwoordcodes[3] == codes[0]) {
			hintposities[3] = wit;
		}

		else
			hintposities[3] = none;

		Boolean hintpostitiesGoed = hintposities[0] == zwart && hintposities[1] == zwart && hintposities[2] == zwart
				&& hintposities[3] == zwart;

		if (hintpostitiesGoed == true) {
			System.out.println("Gefeliciteerd!");

		} else {
			System.out.println("fout!");

			System.out.print("hint: ");
			for (int a : hintposities) {
				System.out.print(a + " ");
			}

		}

		return hintpostitiesGoed;

	}

	public Boolean EindResultaat() {
		int[] hintposities = new int[4];
		int zwart = 8;
		Boolean hintpostitiesGoed = hintposities[0] == zwart && hintposities[1] == zwart && hintposities[2] == zwart
				&& hintposities[3] == zwart;

		if (hintpostitiesGoed == true) {
			System.out.println("Gefeliciteerd!");

		} else {
			System.out.println("fout!");

			System.out.print("hint: ");
			for (int a : hintposities) {
				System.out.print(a + " ");
			}

		}

		return hintpostitiesGoed;

	}

}
