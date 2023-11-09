package tp;

import java.util.Random;
import java.util.Scanner;

public class Tp1Num2 {
	
	public static final Random NUMERO = new Random();
	public static final int LOW = 1;
	public static final int HIGH = 20;
	public static final Scanner KEYBOARD = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner KEYBOARD = new Scanner(System.in);
        boolean playAgain;

        do {
            playGame(KEYBOARD);

            afficherMessage("Voulez-vous jouer à nouveau ? (Oui/Non)");
            String response = KEYBOARD.next().toLowerCase();
            playAgain = response.equals("oui");

        } while (playAgain);
        
        afficherMessage("Merci d'avoir joué !");
        System.exit(0);
    }

	public static void playGame(Scanner KEYBOARD) {
		// TODO Auto-generated method stub
		
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
			afficherMessage("Bravo! Vous avez trouvez le nom " + RESULT + "!!");
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
