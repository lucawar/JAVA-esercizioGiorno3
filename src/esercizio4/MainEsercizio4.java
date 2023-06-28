package esercizio4;

import java.util.Scanner;

public class MainEsercizio4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("inserisci un numero da cui far partire un countdown:");
		int numero = input.nextInt();

		System.out.println(" ");

//CICLO FOR IN NEGATIVO PER STAMPARE I NUMERI AL CONTRARIO
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

		System.out.println("AUGURI!");

		input.close();

	}

}
