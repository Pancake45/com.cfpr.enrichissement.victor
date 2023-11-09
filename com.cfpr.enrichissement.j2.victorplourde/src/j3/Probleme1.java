package j3;

import java.util.Scanner;

public class Probleme1 {

	public static final Scanner KEYBOARD = new Scanner(System.in);
	public static int USERINPUT = 0;
	public static double RESULT = 0;
	
	public static void main(String[] args) {
		
		do {
			try {
				PrendreInfo(KEYBOARD);

			} catch (Exception e) {
				message("Erreur : Veuillez rentrer un nombre entier :");
				KEYBOARD.next();	
			}	
			
			if (USERINPUT >= 1) {
				break;
			}
		}while (true);
		
		
		calculerCirconference(USERINPUT);			
		afficherReponse(USERINPUT);

	}
	public static void PrendreInfo(Scanner keyboard) {
		
		message("Veuillez entrez le rayon : (Un nombre entier)");
		USERINPUT = keyboard.nextInt();
		
		
		
	}
	
	public static int calculerCirconference(int circonference) {
		
		RESULT = Math.PI * 2 * USERINPUT;
		
		

		return circonference;
	}
	
	public static int afficherReponse(int reponse) {
		
		message("La circonference du cercle est : " + RESULT);
		
		return reponse;
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
