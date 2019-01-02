
import java.util.*;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	static String input = scanner.next();
	static boolean ok = true;

	public static void main(String args[]) {

		for (int i = 0; i < input.length(); i++) {
			if (input.substring(i, i + 1).equals("I") || input.substring(i, i + 1).equals("O")
					|| input.substring(i, i + 1).equals("S") || input.substring(i, i + 1).equals("H")
					|| input.substring(i, i + 1).equals("Z") || input.substring(i, i + 1).equals("X")
					|| input.substring(i, i + 1).equals("N")) {

			} else {
				ok = false;
				break;
			}

		}
		if (ok) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
