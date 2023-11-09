package j3;

public class Tableau2 {

	public static void main(String[] args) {
		double[] tbl = new double[10];

		for (int i = 0; i < tbl.length; i++) {
			tbl[i] = i;
			messageS(tbl[i]);
		}
		
	}
	public static void messageS(double tbl) {
		
		System.out.println(tbl);
		System.out.println("------------------------");
	}
		
	public static void messageI(int message) {
		
		System.out.println(message);
		System.out.println("------------------------");
	}
}
