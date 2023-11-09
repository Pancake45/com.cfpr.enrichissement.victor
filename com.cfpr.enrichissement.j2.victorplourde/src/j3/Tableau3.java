package j3;

import java.util.Random;

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
			messageI(i +" "+ RESULT);
		}
		

	}
	
    static void reverse(int a[], int n) 
    { 
        int[] b = new int[n]; 
        int j = n; 
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
  
        // printing the reversed array 
        System.out.println("\n"); 
        for (int k = 0; k < n; k++) { 
            System.out.println(b[k]); 
        } 
    } 

	public static void messageS(double tbl) {
		
		System.out.println(tbl);
	}
		
	public static void messageI(String string) {
		
		System.out.println(string);
	}
}

