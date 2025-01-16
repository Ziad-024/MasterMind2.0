package MasterMind2_0;

import java.util.Random;
import java.util.Scanner;

public class codesFunctie  {
	
	public int [] codesFunctie () {
		
		int[] kleuren = { 1, 2, 3, 4, 5, 6 };
		Random rand = new Random();

		int code1 = rand.nextInt(6);
		int code2 = rand.nextInt(6);
		int code3 = rand.nextInt(6);
		int code4 = rand.nextInt(6);
		int[] codes = { kleuren[code1], kleuren[code2], kleuren[code3], kleuren[code4] };
		
return codes;

	}
	
	
}
