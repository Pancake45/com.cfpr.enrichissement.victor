package j2;

import java.util.Scanner;

public class Probleme2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lectureClavier = new Scanner(System.in);
		String motEcris;
		
		afficherMessage("Qu'elle est le mot que vous voulez savoir le nombre de caractère");
		
		motEcris = lectureClavier.nextLine();

		afficherMessage(motEcris.length());
		
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
