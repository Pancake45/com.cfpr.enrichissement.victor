package j2;

import java.util.Scanner;

public class Probleme5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String reverse = "";
		String userinput;
		Scanner lectureClavier = new Scanner(System.in);
		
		
		for(int countCharacter = 0; countCharacter < alphabet.length(); countCharacter++) {
			System.out.print(alphabet.charAt(countCharacter));
		}
		afficherMessage(reverse);
		for(int countCharacter0 = 0; countCharacter0 < alphabet.length(); countCharacter0++) {
			reverse = alphabet.charAt(countCharacter0) + reverse;
		}
		afficherMessage(reverse);
		
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
