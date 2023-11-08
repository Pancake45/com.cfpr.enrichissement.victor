package tp;

import java.util.Scanner;

public class Tp1Argent {

	public static final double reponse = 0;
	public static Scanner lecture = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double userInput;

		double[][] argent = {{100,0},{50,0},{20,0},{10,0},{5,0},{2,0},{1,0},{0.25},{0.10,0},{0.05,0},{0.01,0}};  
		
		afficherMessage("Entrez un nombre :");
		userInput = lecture.nextDouble();
		
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
	public static void afficherMessage(String message) {
		
		System.out.println(message);
		System.out.println("------------------------");
	}
	
	public static void afficherMessage(int message) {
	
		System.out.println(message);
		System.out.println("------------------------");
	}

}
