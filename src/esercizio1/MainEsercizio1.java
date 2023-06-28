package esercizio1;

public class MainEsercizio1 {

	public static void main(String[] args) {
//VARIABILI STRINGA
		String input = "FORZA ROMA!";
		boolean lengthStr = StringaPariDispari(input);
		System.out.println("La stringa ha una lunghezza pari?");
		System.out.println(lengthStr);

//VARIABILI ANNO
		int anno = 1927;
		boolean isLeapYear = annoBisestile(anno);
		System.out.println("L'anno " + anno + " è bisestile? " + isLeapYear);
		System.out.println(isLeapYear);
	}

//METODO PER VERIFICARE SE LA STRINGA INSERITA è PARA O DISPARA
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
		if (anno % 400 == 0) {
			return true;
		} else if (anno % 100 == 0) {
			return false;
		} else if (anno % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
