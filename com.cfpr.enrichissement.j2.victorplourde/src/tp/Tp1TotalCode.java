package tp;

import java.util.Random;
import java.util.Scanner;


public class Tp1TotalCode {

	public static Scanner KEYBOARD = new Scanner(System.in);
	public static int USERINPUT = 0; 
	public static int CHOICE = 0;
	
	public static final Random NUMERO = new Random();
	public static final int LOW = 1;
	public static final int HIGH = 20;
	
	public static void main(String[] args) {

		System.out.println("TRAVAIL PRATIQUE #1 - Victor Plourde");
		System.out.println("------------------------------------\n");
		System.out.println("1) Transfomer $$$ en monnaie");
		System.out.println("2) Jeu trouver un nombre mystère");
		System.out.println("3) Quitter \n");
		System.out.println("Choix : ");
		USERINPUT = KEYBOARD.nextInt();
		
		CHOICE = USERINPUT;
		
		if (CHOICE == 1) {
			moneyLauncher(KEYBOARD);
		}
		else if (CHOICE == 2) {
			numberLaucher(KEYBOARD);
		}
		else if (CHOICE == 3) {
			afficherMessage("Vous quitter le programme");
			System.exit(0);
		}
	}
	
	
	
	//
	//Money Program
	//
	public static void moneyLauncher(Scanner KEYBOARD) {
		Scanner keyboard = new Scanner(System.in);
		boolean playagain;
		
		do {
            moneyGame(keyboard);

            afficherMessage("Voulez-vous recommencer le programme ? (Oui/Non)");
            String response = keyboard.next().toLowerCase();
            playagain = response.equals("oui");

        } while (playagain);
        
        afficherMessage("Vous quitter le programme.");
        System.exit(0);
	}
	
	public static void moneyGame(Scanner KEYBOARD) {
		double	userInput;

		double[][] argent = {{100,0},{50,0},{20,0},{10,0},{5,0},{2,0},{1,0},{0.25},{0.10,0},{0.05,0},{0.01,0}};  
		
		afficherMessage("Entrez un nombre :");
		userInput = KEYBOARD.nextDouble();
		
		afficherMessage("Vous avez entrez : " + userInput);
		
		for (int i = 0; i < argent.length; i++) {
			int quantite = (int)(userInput / argent[i][0]);
			if (quantite >= 1) 
			{
				userInput -= quantite * argent[i][0];
				afficherMessage(quantite + " x " + argent[i][0]);
				
			}
		}
	}
	
	
	
	//
	//Game random number
	//
	 public static void numberLaucher(Scanner KEYBOARD) {
	    boolean playAgain;

	    do {
	        numberGame(KEYBOARD);

	        afficherMessage("Voulez-vous jouer à nouveau ? (Oui/Non)");
	        String response = KEYBOARD.next().toLowerCase();
            playAgain = response.equals("oui");

        } while (playAgain);
	        
	        afficherMessage("Merci d'avoir joué !");
	        System.exit(0);
	    }

	public static void numberGame(Scanner KEYBOARD) {

			
		int RESULT = NUMERO.nextInt(HIGH-LOW) + LOW;
		int count = 0;
		int USERINPUT = 0;
			
			
		afficherMessage("Le nombre a ete generer, trouver le!");
		USERINPUT = KEYBOARD.nextInt();
			
		do {
				
				
			if (USERINPUT > RESULT) {
				afficherMessage("Le numero que tu as inscrit est plus bas que le numero que tu dois trouver");
				USERINPUT = KEYBOARD.nextInt();
				
			}
			if (USERINPUT < RESULT) {
				afficherMessage("Le numero que tu as inscrit est plus haut que le numero que tu dois trouver");
				USERINPUT = KEYBOARD.nextInt();
				
			}
				
			count++;
			
		} while (USERINPUT != RESULT && count < 7);
	 
		if (USERINPUT == RESULT) {
			afficherMessage("Bravo! Vous avez trouvez le nombre " + RESULT + "!!");
		}
		else if (USERINPUT != RESULT) {
			afficherMessage("Malheureusemen, vous n'avez pas trouver le nombre qui était " + RESULT + ". Peux-etre que la prochaine fois sera le bonne?");
		}
			
	}
		
	public static void afficherMessage(String message) {
			
		System.out.println(message);
		System.out.println("------------------------");
	}
		
	public static void afficherMessage(int message) {
		
		System.out.println(message);
		System.out.println("------------------------");
	}
}
