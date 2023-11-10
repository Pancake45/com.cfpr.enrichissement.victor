package j3;

import java.util.Arrays;
import java.util.Random;

public class Tableau7 {
	
	public static final int[] TBL = new int[10];
	public static final Random NUMERO = new Random();
	public static final int LOW = 1;
	public static final int HIGH = 5;
	public static int temps1 = 0;
	public static int temps2 = 0;
	public static int temps3 = 0;
	public static int temps4 = 0;

	public static void main(String[] args) {
		getRandomNumb();
		calculNumb();
		printTbl();
		
	}
	
	public static void getRandomNumb() {
		
		for (int i = 0; i < TBL.length; i++) {
			TBL[i] = (int)NUMERO.nextInt(HIGH-LOW) + LOW;
		}
	}
	
	public static void printTbl () {
		message("Tableau : " + Arrays.toString(TBL));
		message("Nombre de 1 : " + temps1);
		message("Nombre de 2 : " + temps2);
		message("Nombre de 3 : " + temps3);
		message("Nombre de 4 : " + temps4);
	}
	
	public static void calculNumb () {
		
		for (int i = 0; i < TBL.length; i++) {
			if (TBL[i] == 1) {
				temps1++;
			}
			if (TBL[i] == 2) {
				temps2++;
			}
			if (TBL[i] == 3) {
				temps3++;
			}
			if (TBL[i] == 4) {
				temps4++;
			}
		}
	}
	
	public static void message(String string) {
		System.out.println(string);
	}
	public static void message(int string) {
		System.out.println(string);
	}
}