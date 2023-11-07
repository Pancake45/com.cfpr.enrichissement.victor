package com.cfpr.enrichissement.j2.victorplourde;

public class testj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String w = "B";
		String z = "!!";
		
		
		String x = new String("B");
		String y = new String("B");
		
		boolean diff = true;
		
		if(x.equals(y)) {
			diff = true;
		}else {
			diff = false;
		}
		
		afficherMessage(String.valueOf(diff));
		
		if (x == y) {
			diff = true;
		}else {
			diff = false;
		}
		
		afficherMessage(String.valueOf(diff));
	}
	public static int calculerTotal(int montantA, int montantB) {
	
		int total = 0;
		
		total = montantA + montantB;
		
		return total;
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
