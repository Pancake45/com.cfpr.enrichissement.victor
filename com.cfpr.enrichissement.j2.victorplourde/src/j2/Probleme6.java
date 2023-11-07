package j2;

import java.util.Scanner;

public class Probleme6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lectureClavier = new Scanner(System.in);
		int userinput;
		int maxNumber = 0;
		int minNumber = 0;
		
		do {
			afficherMessage("Ecris un nombre :");
			userinput = lectureClavier.nextInt();
			minNumber = userinput;
			
			if (userinput > maxNumber) {
				maxNumber = userinput;
			}
			if (userinput < minNumber) {
				minNumber = userinput;
			}
			
		} while (0 < userinput);
		
		afficherMessage("Le plus grand nombre est : " + maxNumber);
		afficherMessage("Le plus petit nombre est : " + minNumber);
		
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
