package j2;

public class Probleme1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg = "allo";
		
		afficherMessage(msg.toUpperCase()); 
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
