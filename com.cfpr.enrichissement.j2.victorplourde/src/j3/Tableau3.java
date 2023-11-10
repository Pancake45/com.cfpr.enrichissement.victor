package j3;

import java.util.Random;
import java.util.Arrays;

public class Tableau3 {

	public static final int[] TBL1 = new int[10]; 
	public static final int[] TBL2 = new int[10]; 
	public static final Random NUMERO = new Random();
	public static final int LOW = 1;
	public static final int HIGH = 200;
	public static int RESULT = NUMERO.nextInt(HIGH-LOW) + LOW;
	public static int RESULT_TBL2 = 0;
	
	public static void main(String[] args) {
		
		numTableau1();
		reverse(TBL1, TBL1.length);
	}
	
	public static void numTableau1() {
		
		for (int i = 0; i < TBL1.length; i++) {
			RESULT = NUMERO.nextInt(HIGH-LOW) + LOW;
			TBL1[i] = RESULT;
		}
		

	}
	
    static void reverse(int a[], int n) 
    { 
    	for (int i = 0; i < TBL1.length; i++) {
			int tmp = TBL1[i];
			TBL2[i] = TBL1[TBL2.length-i-1];
			TBL2[TBL2.length-i-1] = tmp;
			
		}
    	messageI("Tableau1 avant l'inversion: " + Arrays.toString(TBL1));
		messageI("Tableau2 apres l'inversion: " + Arrays.toString(TBL2));
    } 

	public static void messageS(double tbl) {
		
		System.out.println(tbl);
	}
		
	public static void messageI(String string) {
		
		System.out.println(string);
	}
}

