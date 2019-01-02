
//j3 Haydn Keung
import java.util.*;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	static String input = scanner.next();
	static boolean found = false;
	static int record = 0;

	public static void main(String args[]) {

		if (input.length() == 1) {
			found = true;
			System.out.println("1");
		} else {
			for (int i = 0; i < input.length(); i++) {
				for (int j = input.length(); j >= i + 1; j--) {
					if (((input.substring(i, j)).trim()).equals(reverseMe(input.substring(i, j)))) {
						if (input.substring(i, j).length() > 1) {
							if (input.substring(i, j).length() > record) {
								record = input.substring(i, j).length();
							}
							found = true;

							// break all;
						}
					}
				}
			}
		}
		if (!found) {
			System.out.println("1");
		} else {
			System.out.println(record);
		}

	}

	public static String reverseMe(String input1) {
		String newString = "";
		ArrayList<String> reverse = new ArrayList<String>();

		for (int k = 0; k < input1.length(); k++) {
			reverse.add(input1.substring(k, k + 1));

		}
		Collections.reverse(reverse);
		for (int l = 0; l < reverse.size(); l++) {
			newString += reverse.get(l);
		}
		newString.trim();
		return newString;
	}
}
