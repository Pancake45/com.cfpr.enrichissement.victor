package j3;

import java.util.Arrays;
import java.util.Scanner;

public class Tableau8 {

	public static int[][] TBL = new int[3][8];
	public static final Scanner KEYBOARD = new Scanner(System.in);
	public static String STUDENT = "";
	public static String QUIT = "";
	public static String CHOICE = "";
	public static int RESULT_TP1 = 0;
	public static int RESULT_TP2 = 0;
	public static int RESULT_EXAM = 0;
	public static float RESULT_MOY_TP1 = 0;
	public static float RESULT_MOY_TP2 = 0;
	public static float RESULT_MOY_EXAM = 0;
	
	public static void main(String[] args) {
		getDataTBL();
		
		do {
			message("Voulez vous rentrez un nom ?");
			CHOICE = KEYBOARD.nextLine();
			
			if (CHOICE.toLowerCase().equals("oui")) {
				do {
					knowInfo();
					knowStudent();
					moyeEval();
					printTBL();
					message("Voulez vous quitter ? ");
					QUIT = KEYBOARD.nextLine();
					
					if (QUIT.toLowerCase().equals("oui")) {
						break;
					}
					
				} while (true);
				System.exit(0);
			}else if (CHOICE.toLowerCase().equals("non")) {
				moyeEval();
				printTBL();
				message("Voulez vous quitter ? ");
				QUIT = KEYBOARD.nextLine();
				
				if (QUIT.toLowerCase().equals("oui")) {
					break;
				}
			}
			else {
				message("Veuillez rentrez une reponse : ");
			}
			
		} while (true);
		
	}
	
	public static void getDataTBL() {
		TBL[0] = new int[] {65,78,43,82,76,91,71,96};
		TBL[1] = new int[] {45,55,67,89,100,95,92,81};
		TBL[2] = new int[] {34,65,21,67,75,54,69,54};
	}

	public static void knowInfo() {
		
		message("Veuillez entrer le nom de l'etudiant : ");
		STUDENT = KEYBOARD.nextLine();	
		
	}
	
	public static void knowStudent() {
		
		if (STUDENT.toLowerCase().equals("pierre")) {
			message("Veulliez entrer la note du TP1 : ");
			RESULT_TP1 = KEYBOARD.nextInt();		
			TBL[0][0] = RESULT_TP1;
			
			message("Veuillez entrer la note du TP2 : ");
			RESULT_TP2 = KEYBOARD.nextInt();
			TBL[1][0] = RESULT_TP2;
			
			message("Veuillez entrer la note de l'examen : ");
			RESULT_EXAM = KEYBOARD.nextInt();
			TBL[2][0] = RESULT_EXAM;
		}
		if (STUDENT.toLowerCase().equals("andre")) {
			message("Veulliez entrer la note du TP1 : ");
			RESULT_TP1 = KEYBOARD.nextInt();		
			TBL[0][1] = RESULT_TP1;
			
			message("Veuillez entrer la note du TP2 : ");
			RESULT_TP2 = KEYBOARD.nextInt();
			TBL[1][1] = RESULT_TP2;
			
			message("Veuillez entrer la note de l'examen : ");
			RESULT_EXAM = KEYBOARD.nextInt();
			TBL[2][1] = RESULT_EXAM;
		}
		if (STUDENT.toLowerCase().equals("julie")) {
			message("Veulliez entrer la note du TP1 : ");
			RESULT_TP1 = KEYBOARD.nextInt();		
			TBL[0][2] = RESULT_TP1;
			
			message("Veuillez entrer la note du TP2 : ");
			RESULT_TP2 = KEYBOARD.nextInt();
			TBL[1][2] = RESULT_TP2;
			
			message("Veuillez entrer la note de l'examen : ");
			RESULT_EXAM = KEYBOARD.nextInt();
			TBL[2][2] = RESULT_EXAM;
		}
		if (STUDENT.toLowerCase().equals("brigitte")) {
			message("Veulliez entrer la note du TP1 : ");
			RESULT_TP1 = KEYBOARD.nextInt();		
			TBL[0][3] = RESULT_TP1;
			
			message("Veuillez entrer la note du TP2 : ");
			RESULT_TP2 = KEYBOARD.nextInt();
			TBL[1][3] = RESULT_TP2;
			
			message("Veuillez entrer la note de l'examen : ");
			RESULT_EXAM = KEYBOARD.nextInt();
			TBL[2][3] = RESULT_EXAM;
		}
		if (STUDENT.toLowerCase().equals("anne")) {
			message("Veulliez entrer la note du TP1 : ");
			RESULT_TP1 = KEYBOARD.nextInt();		
			TBL[0][4] = RESULT_TP1;
			
			message("Veuillez entrer la note du TP2 : ");
			RESULT_TP2 = KEYBOARD.nextInt();
			TBL[1][4] = RESULT_TP2;
			
			message("Veuillez entrer la note de l'examen : ");
			RESULT_EXAM = KEYBOARD.nextInt();
			TBL[2][4] = RESULT_EXAM;
		}
		if (STUDENT.toLowerCase().equals("olivier")) {
			message("Veulliez entrer la note du TP1 : ");
			RESULT_TP1 = KEYBOARD.nextInt();		
			TBL[0][5] = RESULT_TP1;
			
			message("Veuillez entrer la note du TP2 : ");
			RESULT_TP2 = KEYBOARD.nextInt();
			TBL[1][5] = RESULT_TP2;
			
			message("Veuillez entrer la note de l'examen : ");
			RESULT_EXAM = KEYBOARD.nextInt();
			TBL[2][5] = RESULT_EXAM;
		}
		if (STUDENT.toLowerCase().equals("simon")) {
			message("Veulliez entrer la note du TP1 : ");
			RESULT_TP1 = KEYBOARD.nextInt();		
			TBL[0][6] = RESULT_TP1;
			
			message("Veuillez entrer la note du TP2 : ");
			RESULT_TP2 = KEYBOARD.nextInt();
			TBL[1][6] = RESULT_TP2;
			
			message("Veuillez entrer la note de l'examen : ");
			RESULT_EXAM = KEYBOARD.nextInt();
			TBL[2][6] = RESULT_EXAM;
		}
		if (STUDENT.toLowerCase().equals("nadine")) {
			message("Veulliez entrer la note du TP1 : ");
			RESULT_TP1 = KEYBOARD.nextInt();		
			TBL[0][0] = RESULT_TP1;
			
			message("Veuillez entrer la note du TP2 : ");
			RESULT_TP2 = KEYBOARD.nextInt();
			TBL[1][0] = RESULT_TP2;
			
			message("Veuillez entrer la note de l'examen : ");
			RESULT_EXAM = KEYBOARD.nextInt();
			TBL[2][0] = RESULT_EXAM;
		}
		
		KEYBOARD.nextLine();
	}
	
	public static void moyeEval() {
		int resultSommeTp1 = 0;
		int resultSommeTp2 = 0;
		int resultSommeExam = 0;
		
		for (int i = 0; i < TBL[0].length; i++) {
			resultSommeTp1 += TBL[0][i];
			resultSommeTp2 += TBL[1][i];
			resultSommeExam += TBL[2][i];
		}
		RESULT_MOY_TP1 = (float) resultSommeTp1 / TBL[0].length;
		RESULT_MOY_TP2 = (float) resultSommeTp2 / TBL[0].length;
		RESULT_MOY_EXAM = (float) resultSommeExam / TBL[0].length;
	}
	
	public static void moyÉtu() {
		int 
		
		for (int i = 0; i < TBL[0].length; i++) {
			
		}
	}
	
	public static void printTBL() {
		message("Tableau : " + Arrays.deepToString(TBL) + "\n");
		
		message("Moyenne du TP1 : " + RESULT_MOY_TP1);
		message("Moyenne du TP2 : " + RESULT_MOY_TP2);
		message("Moyenne de l'examen : " + RESULT_MOY_EXAM);
		message("-----------------------------------------------\n");
		
		
	}
	
	public static void message(String string) {
		System.out.println(string);
	}
	public static void message(int number) {
		System.out.println(number);
	}
}
