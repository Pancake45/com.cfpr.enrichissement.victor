package j3;

public class Tableau1 {

	public static void main(String[] args) {
		String[] tbl = {"allo", "salut", "bonjour", "hola", "Hi"};
		
		for (int i =0; i < tbl.length; i++) {
			
			messageS(tbl[i]);
		}
	}
	public static void messageS(String tbl) {
		
		System.out.println(tbl);
		System.out.println("------------------------");
	}
		
	public static void messageI(int message) {
		
		System.out.println(message);
		System.out.println("------------------------");
	}
}
