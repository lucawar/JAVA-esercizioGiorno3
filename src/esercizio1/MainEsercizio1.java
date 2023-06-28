package esercizio1;

import java.util.Scanner;

public class MainEsercizio1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

//INPUT SCANNER STRINGA
		System.out.println("Inserisci una parola:");
		String parola = input.nextLine();

		boolean parolaLength = stringaPariDispari(parola);

		System.out.println(parola.toUpperCase() + " " + "ha una lunghezza pari ? ");
		System.out.println(parolaLength);

		System.out.println(" ");

//INPUT SCANNER ANNO BISESTILE	

		System.out.println("Iserisci un anno:");
		int anno = input.nextInt();

		boolean annoBis = annoBisestile(anno);
		System.out.println("L'anno " + anno + " è bisestile ?");
		System.out.println(annoBis);

		input.close();

	}

//METODO PER VERIFICARE SE LA STRINGA INSERITA è PARI O DISPARI
	public static boolean stringaPariDispari(String str) {
		int length = str.length();

		if (length % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

//METODO PER VERIFICARE SE UN ANNO è BISESTILE
	public static boolean annoBisestile(int anno) {
		if (anno % 400 == 0 || anno % 4 == 0) {
			return true;
		} else if (anno % 100 == 0) {
			return false;
		} else {
			return false;
		}
	}
}
