package j3;

import java.util.Random;

public class Tableau4 {

	public static int[] tbl = new int[5];
	public static final Random NUMERO = new Random();
	public static final int LOW = 1;
	public static final int HIGH = 100;
	public static int RESULT = NUMERO.nextInt(HIGH-LOW) + LOW;
	public static int MAX = 0;
	public static int MIN = Integer.MAX_VALUE;
	public static int POSITION = 0;
	
	public static void main(String[] args) {
		insertRandomNumberArray(tbl);
		
		if (POSITION != -1) {
			  System.out.println("The value " + tbl + " is found at position " + POSITION);
			} else {
			  System.out.println("The value " + tbl + " is not present in the array");
			}
	}
	public static int[] insertRandomNumberArray(int[] array) {
		
		for (int i = 0; i < tbl.length; i++) {
			RESULT = NUMERO.nextInt(HIGH-LOW) + LOW;
			tbl[i] = RESULT;
			
			if (tbl[i] > MAX) {
				MAX = RESULT;
			}
			if (tbl[i] < MIN) {
				MIN = RESULT;
			}
			message(RESULT);
		}
		message("\nMin : " + MIN );
		message("Max : " + MAX);
		
		for (int i = 0; i > tbl.length; i++) {
			if (tbl[i] == MAX) {
				POSITION = i;
			}
		}
		message("La position MAX est : " + POSITION);
		
		int[] returntbl = {MAX,MIN};
		return	returntbl;
	}
	
	public static int finfingPosition(int target) {
		for (int i = 0; i < tbl.length; i++) {
		    if (tbl[i] == target) {
		      return i; // Return the index of the target value
		    }
		  }

		  return -1; // Value not found
	}
	
	public static void message(double tbl) {
		
		System.out.println(tbl);
	}
		
	public static void message(String string) {
		
		System.out.println(string);
	}
}
