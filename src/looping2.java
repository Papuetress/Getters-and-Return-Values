import java.util.Arrays;
import java.util.Scanner;

class Search {

	void legumeFinder(String g) {
		String[] legume = { "cartof", "ceapa", "ghimbir", "gulie", "hasma",
				"sparanghel", "telină", "usturoi", "hrean", "morcov",
				"pastarnac", "ridiche", "scortonera", "sfecla", "ardei",
				"bamă", "castravete", "dovleac", "dovlecel", "pepene galben",
				"pepene verde", "roșie", "vanata", "cimbru", "creson",
				"laptuca", "leustean", "loboda", "macris", "marar",
				"patrunjel", "tarhon", "salata", "spanac", "stevie", "telina",
				"varza", "fasole" };
		if (Arrays.asList(legume).contains(g)) {
			System.out.println("Este ba sa moara Sandu Hingheru'");
		} else {
			System.out.println("Pffff, nu e sa moara Jean");
		}
	}

	void fructeFinder(String g) {
		String[] fructe = { "banane", "mere", "pere", "ananas", "avocado",
				"alune", "castane", "capsuni", "cirese", "coacaze", "cocos",
				"corcoduse", "dude", "fistic", "fragi", "grepfrut", "gutui",
				"kiwi", "lamai", "pepene galben", "pepene verde", "mango",
				"mandarine", "macese", "creson", "masline", "migdale", "mure",
				"nuci", "nectarine", "papaya", "piersici", "portocale",
				"piper", "prune", "rodii", "smochine", "soc", "visine",
				"struguri", "zmeura" };
		if (Arrays.asList(fructe).contains(g)) {
			System.out.println("Este ba sa moara Sandu Hingheru'");
		} else {
			System.out.println("Pffff, nu e sa moara Jean");
		}
	}
}

public class looping2 {
	private static Scanner scan;

	public static void main(String[] args) {

		Search bot = new Search();
		boolean bool = true;
		while (bool) {
			scan = new Scanner(System.in);
			System.out.println("Ia zi gogule 'legume' sau 'fructe'");
			String input = scan.nextLine();
			if (input.equals("quit")) {
				bool = false;
				System.out.println("Program Terminated");
			} else if (input.equals("fructe")) {
				System.out.println("Baga niste fructe");
				String fructe = scan.nextLine();
				bot.fructeFinder(fructe);
			} else if (input.equals("legume")) {
				System.out.println("Zi o leguma");
				String legume = scan.nextLine();
				bot.legumeFinder(legume);
			} else {
				System.out.println("Unknown command, type 'fructe' sau 'legume'"
								+ "\n'quit' pt terminare");
			}

		}
	}

}
