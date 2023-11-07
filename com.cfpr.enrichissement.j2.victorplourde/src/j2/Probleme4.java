package j2;


import java.util.Scanner;

public class Probleme4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lectureClavier = new Scanner(System.in);
		int userInput;
		
		
		do {
			 afficherMessage("Entrez quelque chose");
			userInput = lectureClavier.nextInt();
			 
			 
		}while (0 > userInput|| 100 < userInput);

		
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
