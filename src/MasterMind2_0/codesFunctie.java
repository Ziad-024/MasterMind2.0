package MasterMind2_0;

import java.util.Random;
import java.util.Scanner;

public class codesFunctie {

	public int[] codesFunctie() {

		int[] kleuren = { 1, 2, 3, 4, 5, 6 };
		Random rand = new Random();

		int code1 = rand.nextInt(6);
		int code2 = rand.nextInt(6);
		int code3 = rand.nextInt(6);
		int code4 = rand.nextInt(6);
		int[] codes = { kleuren[code1], kleuren[code2], kleuren[code3], kleuren[code4] };

		return codes;

	}

	public int NaKijkFunction(int[] codes, int[] antwoordcodes, int[] kleuren) {
		int[] hintposities = new int[4];
		int wit = 7;
		int zwart = 8;
		int none = 0;
		Scanner sc = new Scanner (System.in);
		
		
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

		if (antwoordcodes[0] == codes[0]) {
			hintposities[0] = zwart;
		}

		else if (antwoordcodes[0] == codes[1]) {
			hintposities[0] = wit;
		}

		else if (antwoordcodes[0] == codes[2]) {
			hintposities[0] = wit;

		} else if (antwoordcodes[0] == codes[3]) {
			hintposities[0] = wit;

		} else
			hintposities[0] = none;

		if (antwoordcodes[1] == codes[1]) {
			hintposities[1] = zwart;
		}

		else if (antwoordcodes[1] == codes[2]) {
			hintposities[1] = wit;
		}

		else if (antwoordcodes[1] == codes[3]) {
			hintposities[1] = wit;

		}

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

		} else {
			System.out.println("fout!");

			System.out.print("hint: ");
			for (int a : hintposities) {
				System.out.print(a + " ");
			}
			;

		}

		return hintpostitiesGoed;

	}
	
	
	
	}
	

