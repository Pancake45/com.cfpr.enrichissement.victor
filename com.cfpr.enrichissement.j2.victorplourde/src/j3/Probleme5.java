package j3;

import java.util.Scanner;

public class Probleme5 {

	public static final Scanner KEYBOARD = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		do {
			message("Convertir en Fahrenheit : C \nConvertir en Celsius : F");
			String choix = KEYBOARD.nextLine();
			
			if (choix.equals("F") || choix.equals("f")) {
				
				message("Veuillez entrer la temperature que vous voulez avoir en fahrenheit :");
				int userInputF = KEYBOARD.nextInt();
				int valueF = calculFahrenheit(userInputF);
				message(userInputF + " en fahreinheit equivaux a " + valueF);
				break;
			}
			else if (choix.equals("C") || choix.equals("c")) {
				
				message("Veuillez entrer la temperature que vous vouelz avoir en celcius :");
				int userInputC = KEYBOARD.nextInt();
				int valueC = calculCelcius(userInputC);
				message(userInputC + " en celcius equivaux a " + valueC);
				break;
			}
			else {
				message("Veuillez reessayer");
			}
		} while (true);
		
		
		
	}
	
	public static int calculFahrenheit(int vf) {

		vf = (vf - 32) * 5/9;
		
		return vf;
	}
	
	public static int calculCelcius(int vc) {
		
		vc = vc * 9 / 5 + 32;
		
		return vc;
	}
	
	public static void message(String message) {
		
		System.out.println(message);
		System.out.println("------------------------");
	}
		
	public static void message(int message) {
		
		System.out.println(message);
		System.out.println("------------------------");
	}

}
