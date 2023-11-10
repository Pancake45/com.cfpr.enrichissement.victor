package j3;

import java.util.Arrays;
import java.util.Random;

public class Tableau5 {

	public static final int[] TBL = new int [10];
	public static final int[] TBL2 = new int [10];
	public static final Random NUMERO = new Random();
	public static final int LOW = 1;
	public static final int HIGH = 100;
	public static int RESULT = NUMERO.nextInt(HIGH-LOW) + LOW;
	
	public static void main(String[] args) {
		
		putRandomNumber();
		exchangeTblValue();
		putDataTbl2();
		printTbl();
	}
	
	public static void putRandomNumber() {
		
		for (int i = 0; i < TBL.length; i++) {
			RESULT = NUMERO.nextInt(HIGH-LOW) + LOW;
			TBL [i] = RESULT;
		}
		
	}
	
	public static void putDataTbl2() {
		for (int i = 0; i < TBL.length; i++)
		{
			TBL2[TBL2.length -1 -i] = TBL[i];
		}
		
		//TBL2[9] = TBL[0];
		//TBL2[8] = TBL[1];
		//TBL2[7] = TBL[2];
		//TBL2[6] = TBL[3];
		//TBL2[5] = TBL[4];
		//TBL2[4] = TBL[5];
		//TBL2[3] = TBL[6];
		//TBL2[2] = TBL[7];
		//TBL2[1] = TBL[8];
		//TBL2[0] = TBL[9];
	}
	
	public static void exchangeTblValue() {
		
		
	}
	
	public static void printTbl() {
		
		message("Le tableau avant inversement : " + Arrays.toString(TBL));
		message("le tableau apres inversement : " + Arrays.toString(TBL2));
	}
	
	public static void message(String string) {
		System.out.println(string);
	}
}
