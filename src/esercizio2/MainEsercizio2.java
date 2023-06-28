package esercizio2;

import java.util.Scanner;

public class MainEsercizio2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci un numero tra 0 e 3: ");
		int numero = input.nextInt();

//COSTRUTTO SWITCH PER VERIFICARE I NUMERI INSERITI
		switch (numero) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Due");
			break;
		case 3:
			System.out.println("Tre");
			break;
		default:
			System.out.println("Errore: il numero inserito non è compreso tra 0 e 3.");
		}

		input.close();
	}

}
