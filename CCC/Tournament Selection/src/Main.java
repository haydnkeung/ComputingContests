
//j1
import java.util.*;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	static ArrayList<String> input = new ArrayList<String>();
	static int wins = 0;
	static int lose = 0;
	// static String[][] stuff;

	public static void main(String args[]) {

		for (int i = 0; i < 6; i++) {
			input.add(scanner.next());
		}

		for (int i = 0; i < 6; i++) {
			if (input.get(i).equals("W")) {
				wins++;
				// System.out.println("TEST");
			}
			// System.out.println("ERROR");
		}

		if (wins == 6 || wins == 5) {
			System.out.println("1");
		} else if (wins == 3 || wins == 4) {
			System.out.println("2");
		} else if (wins == 2 || wins == 1) {
			System.out.println("3");
		} else {
			System.out.println("-1");
		}
		// System.out.println(wins);

	}

}
