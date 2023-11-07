package j2;

import java.util.Scanner;

public class Probleme3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lectureClavier = new Scanner(System.in);
		String phraseUser;
		
		afficherMessage("Entrer une phrase que vous voulez");
		
		phraseUser = lectureClavier.nextLine();
		
		char caractereVoulue = 'a';
		int count = 0;
		
		for (int i = 0; i < phraseUser.length(); i++) {
			if (phraseUser.charAt(i) == caractereVoulue)
				count++;
		}
		
		
		
		afficherMessage("Ta phrase est ca : " + phraseUser.replace("a", "$").toUpperCase() + " Tu as : " + count + " De 'A' dans ta phrase");
		
		
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
