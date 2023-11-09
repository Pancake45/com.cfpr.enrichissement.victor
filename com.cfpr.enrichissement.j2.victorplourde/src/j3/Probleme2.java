package j3;

import java.util.Scanner;

public class Probleme2 {

	public static final Scanner KEYBOARD = new Scanner(System.in);
	public static int USERINPUT = 0;
	public static int premierNombre = 0;
	public static int deuxiemeNombre = 0;
	
	public static void main(String[] args) {
		do {
			try {
				prendreInfo(USERINPUT);
			} catch (Exception e) {
				message("Erreur : Veuillez reessayer : ");
				KEYBOARD.next();
			}
			
			if (premierNombre > 1) {
				break;
			}
			else if (deuxiemeNombre > 1){
				break;
			}
			
		} while (true);

		calculeInfo(KEYBOARD);
	}
	
	public static int prendreInfo(int afficherResultat) {
		
		message("Veuillez entrez le premier nombre :");
		premierNombre = KEYBOARD.nextInt();
		
		message("Veuillez entrez le deuxieme nombre :");
		deuxiemeNombre = KEYBOARD.nextInt();
		
		return afficherResultat;
	}
	
	public static void calculeInfo(Scanner plusPetitPlusGrand) {
		
		if (premierNombre > deuxiemeNombre) {
			message(premierNombre + "  est plus grand que " + deuxiemeNombre);
		}
		else if (deuxiemeNombre > premierNombre) {
			message(deuxiemeNombre + "  est plus grand que " + premierNombre);
		}
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
