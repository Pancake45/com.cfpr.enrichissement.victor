package j3;

import java.util.Arrays;
import java.util.Random;

public class Tableau6 {
	
	public static final double[] TBL = new double[10];
	public static final double[] TBL_POSITIVE = new double[10];
	public static final double[] TBL_NEGATIVE = new double[10];
	public static double RESULT_POSITIVE = 0;
	public static double RESULT_NEGATIVE = 0;
	public static final Random NUMERO = new Random();
	public static final double LOW = -100;
	public static final double HIGH = 100;

	public static void main(String[] args) {
		inputDataTBL();
		knowNegativeOrPositive();
		calculSumTbl();
		printTbl();
	}
	
	public static void inputDataTBL() {
		
		for (int i = 0; i < TBL.length; i++) {
			Double result = (int)NUMERO.nextDouble(HIGH-LOW) + LOW;
			TBL[i] = result;
		}
	}
	
	public static void printTbl() {
		message("Tableau : " + Arrays.toString(TBL));
		message("Tableau positif : " + Arrays.toString(TBL_POSITIVE));
		message("Tableau negatif : " + Arrays.toString(TBL_NEGATIVE));
		message("Somme Negative : " + RESULT_NEGATIVE);
		message("Somme Positive : " + RESULT_POSITIVE);
	}
	
	public static void knowNegativeOrPositive() {
		int positiveIndex = 0;
		int negativeIndex = 0;
		
		for (int i = 0; i < TBL.length; i++) {
			if (TBL[i] > 0) {
				TBL_POSITIVE[positiveIndex++] = TBL[i];
			} else if (TBL[i] < 0) {
				TBL_NEGATIVE[negativeIndex++] = TBL[i];
			}
		}
	}
	
	public static void calculSumTbl() {
		for (int i = 0; i < TBL_POSITIVE.length; i++) {
			RESULT_POSITIVE += TBL_POSITIVE[i];
		}
		for (int i =0; i < TBL_NEGATIVE.length; i++) {
			RESULT_NEGATIVE += TBL_NEGATIVE[i];
		}
	}
	
	public static void message(String string) {
		System.out.println(string);
	}
}