package esercizio1;

public class MainEsercizio1 {

	public static void main(String[] args) {
//VARIABILI STRINGA
		String input = "FORZA ROMA!";
		String input2 = "FORZAROMA!";

		boolean lengthStr = StringaPariDispari(input);
		boolean lengthStr2 = StringaPariDispari(input2);

		System.out.println("La stringa ha una lunghezza pari?");
		System.out.println(lengthStr);
		System.out.println("La stringa ha una lunghezza pari?");
		System.out.println(lengthStr2);

//VARIABILI ANNO
		int anno = 1927;
		int anno2 = 2020;

		boolean annoBis = annoBisestile(anno);
		boolean annoBis2 = annoBisestile(anno2);

		System.out.println("L'anno " + anno + " è bisestile? ");
		System.out.println(annoBis);
		System.out.println("L'anno " + anno2 + " è bisestile? ");
		System.out.println(annoBis2);
	}

//METODO PER VERIFICARE SE LA STRINGA INSERITA è PARI O DISPARI
	public static boolean StringaPariDispari(String str) {
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
