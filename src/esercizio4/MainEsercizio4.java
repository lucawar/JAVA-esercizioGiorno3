package esercizio4;

import java.util.Scanner;

public class MainEsercizio4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("inserisci un numero: ");
		int numero = input.nextInt();

//CICLO FOR IN NEGATIVO PER STAMPARE I NUMERI AL CONTRARIO
		System.out.println("Conto alla rovescia: ");
		for (int i = numero; i >= 0; i--) {
			System.out.println(i);

//METODO "Thread.sleep()" PER IL CONTO ALLA ROVESCIA 
//INSERITO IN UN TRY CATCH PER GESTIRE EVENTUALI ERRORI CAUSATI DA "Thread.sleep()"
//IL "printStackTrace()" TIENE TRACCIA DI EVENTUAALI ERRORI
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		input.close();

	}

}
