package j3;

import java.math.BigInteger;
import java.util.Scanner;

public class Probleme3 {
	
	public static BigInteger RESULT = BigInteger.ONE;
	public static final Scanner KEYBOARD = new Scanner(System.in);
	public static int USERINPUT = 0;

	public static void main(String[] args) {
		
		prendreInfo(null);
		
		afficherFin(null);
	}

	public static void prendreInfo(String info) {
		message("Veuillez entrer le nombre que vous voulez avoir le factorielle : ");
		USERINPUT = KEYBOARD.nextInt();
		
	}
	
	public static BigInteger calculerFactorielle(int factorielle) {
		
		for (int i = 1; i <= factorielle; i++) {
			RESULT = RESULT.multiply(BigInteger.valueOf(i));

		}
		
		return RESULT;
	}
	
	public static void afficherFin(String fin) {
		
		message("Le resultat est : " + RESULT);
	}
	
	public static void message(String message) {
		
		System.out.println(message);
		System.out.println("------------------------");
	}
		
	public static void message(int message) {
		
		System.out.println(message);
		System.out.println("------------------------");
	}
}
