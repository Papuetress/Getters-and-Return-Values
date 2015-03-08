import java.util.Arrays;
import java.util.Scanner;

class Search {

	void find(String g) {
		String[] texts = { "cartof", "ceapa", "ghimbir", "gulie", "hasma",
				"sparanghel", "telină", "usturoi", "hrean", "morcov",
				"pastarnac", "ridiche", "scortonera", "sfecla", "ardei",
				"bamă", "castravete", "dovleac", "dovlecel", "pepene galben",
				"pepene verde", "roșie", "vanata", "cimbru", "creson",
				"laptuca", "leustean", "loboda", "macris", "marar",
				"patrunjel", "tarhon", "salata", "spanac", "stevie", "telina",
				"varza", "fasole" };
		if (Arrays.asList(texts).contains(g)) {
			System.out.println("Este ba sa moara Sandu Hingheru'");
		} else {
			System.out.println("Pffff, nu e sa moara Jean");
		}
	}
}

public class looping2 {
	private static Scanner scan;

	public static void main(String[] args) {

		boolean bool = true;
		while (bool) {
			scan = new Scanner(System.in);
			System.out.println("Ia zi gogule o leguma, tasteaza 'quit' pentru terminare");
			String g = scan.nextLine();
			if (g.equals("quit")) {
				bool = false;
				System.out.println("Program Terminated");
			} else {
				Search bot = new Search();
				bot.find(g);
			}

		}
	}

}
