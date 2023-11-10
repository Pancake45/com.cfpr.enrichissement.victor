package j3;

public class Tableau4 {
	
	public static int[] tableau = new int[5];
	public static int max = 0;
	public static int min = 102;
	public static int maxPos = 0;
	public static int minPos = 0;
	public static void main(String[] args) {
		ajouterNombre();
		plusGrandPlusPetit();
		print("le nombre le plus gros est " + max + ", position " + maxPos + " dans le tableau.");
		print("le nombre le plus petit est " + min + ", position " + minPos + " dans le tableau.");
	}
	
	public static void print(String message) {
		System.out.println(message);
	}
	
	public static double nombreAleatoire() {
		return Math.random() * (100 - 0) + 0;
	}
	
	public static void ajouterNombre() {
		for (int i = 0; i < tableau.length; i++) {
			tableau[i] = (int) nombreAleatoire();
		}
		
	}
	
	public static void plusGrandPlusPetit() {
		for (int i = 1; i < tableau.length; i++) {
			if(tableau[i] > max) {
				max = tableau[i];
				maxPos = i;
			}
			if(tableau[i] < min) {
				min = tableau[i];
				minPos = i;
			}
		}
	}
	
	
	
}