package j3;

public class Defi0 {

	public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] tableau = new char[26];
			
		for (int i = 0; i < ALPHABET.length(); i++) {
			tableau[i] = ALPHABET.charAt(i); 
			afficherMessage(tableau[i]);
		}	
	}
	public static void afficherMessage(char message) {
		
		System.out.println(message);
		System.out.println("------------------------");
	}	
}
