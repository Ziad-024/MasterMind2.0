package MasterMind2_0;

import java.util.Random;
import java.util.Scanner;

public class kleuren {

	public static void main(String[] args) {
        int wit = 7, zwart = 8, none = 0;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] codes = {rand.nextInt(6) + 1, rand.nextInt(6) + 1, rand.nextInt(6) + 1, rand.nextInt(6) + 1};
        
        int rij = 0;
        while (rij++ < 10) {
            System.out.println("Beurt " + rij + "\nRaad de code (1-6):");
            
            // Lezen en valideren van input
            int[] antwoordcodes = new int[4];
            for (int i = 0; i < 4; i++) {
                do {
                    antwoordcodes[i] = sc.nextInt();
                } while (antwoordcodes[i] < 1 || antwoordcodes[i] > 6);
            }

            // Print de gok
            System.out.print("Gok: ");
            for (int a : antwoordcodes) System.out.print(a + " ");
            System.out.println();
            
            // Bepaal de hint
            int[] hintposities = new int[4];
            boolean[] geraden = new boolean[4];
            for (int i = 0; i < 4; i++) {
                if (antwoordcodes[i] == codes[i]) {
                    hintposities[i] = zwart;
                    geraden[i] = true;
                }
            }
            for (int i = 0; i < 4; i++) {
                if (!geraden[i]) {
                    for (int j = 0; j < 4; j++) {
                        if (!geraden[j] && antwoordcodes[i] == codes[j]) {
                            hintposities[i] = wit;
                            geraden[j] = true;
                            break;
                        }
                    }
                }
            }

            // Controleer of de code correct is
            boolean gewonnen = true;
            for (int i = 0; i < 4; i++) {
                if (hintposities[i] != zwart) {
                    gewonnen = false;
                    break;
                }
            }
            if (gewonnen) {
                System.out.println("Gefeliciteerd! Je hebt de code geraden.");
                break;
            }

            System.out.print("Hint: ");
            for (int a : hintposities) System.out.print(a + " ");
            System.out.println();
        }
    }
}