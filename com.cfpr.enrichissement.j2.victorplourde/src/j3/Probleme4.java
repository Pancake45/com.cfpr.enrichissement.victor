package j3;

import java.util.Scanner;

public class Probleme4 {
	
	public static int MAX = 0;
	public static int MIN = 0;
	public static int REPONSE = 0;
	public static final Scanner KEYBOARD = new Scanner(System.in);

	public static void main(String[] args) {
		
		do {
			
			try {
				prendreInfo();	
			} catch (Exception e) {
				message("Erreur : Veuillez reessayer ");
				KEYBOARD.next();
			}
			
			if (MAX >= 1 || MIN >=1) {
				break;
			}
			
		} while (true);
		
		calcule(REPONSE);
		fin();
	}
	
	public static void prendreInfo() {
		message("Entrez un nombre minimum : ");
		MIN = KEYBOARD.nextInt();
		
		message("Entrez un nombre maximum : ");
		MAX = KEYBOARD.nextInt();
		
	}
	
	public static int calcule(int value) {

		
		for(int i = MIN; i <= MAX; i++)
		{
			REPONSE = REPONSE + i;
		}
		
		return REPONSE;
	}
	
	public static void fin() {
		
		message("Le minimum que vous avez mis est : " + MIN + "\nLe maximum que vous avez mis est : " + MAX);
		message("Le total des nombre et de tout ce qui a entre eu est de : " + REPONSE);
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
