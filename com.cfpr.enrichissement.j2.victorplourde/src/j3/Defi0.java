package j3;

public class Defi0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] tableau = new char[26];
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		for (int i = 0; i < alphabet.length(); i++) {
			tableau[i] = alphabet.charAt(i); 
			afficherMessage(tableau[i]);
		}

		
		
	}
	public static void afficherMessage(char message) {
		
		System.out.println(message);
		System.out.println("------------------------");
	}
	
	
}
