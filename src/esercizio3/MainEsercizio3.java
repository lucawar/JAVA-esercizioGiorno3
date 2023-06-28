package esercizio3;

import java.util.Scanner;

public class MainEsercizio3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String inputString;

//CICLO WHILE CHE CONSENTE DI INSERIRE STRINGHE
		while (true) {
			System.out.println("Per terminare il programma,inserire :q");
			System.out.println("Inserisci una parola:");
			inputString = input.nextLine();

//CONDIZIONE CHE TERMINA IL PROGRAMMA QUANDO VIENE INSERITA LA STRINGA ":q"
			if (inputString.equals(":q")) {
				System.out.println("Programma terminato.");
				break;
			}
//METODO "StringBuilder" + "append" PER SUDDIVIDERE LE PAROLE CON UNA ","
			StringBuilder output = new StringBuilder();
			for (int i = 0; i < inputString.length(); i++) {
				output.append(inputString.charAt(i));
				if (i != inputString.length() - 1) {
					output.append(",");
				}
			}

			System.out.println("Stringa suddivisa: " + output.toString());
		}

		input.close();

	}

}
