import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	static int K = scanner.nextInt();
	static String code = scanner.next();
	static ArrayList<Integer> key = new ArrayList<Integer>();
	static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static String[] result = new String[code.length()];
	static String newStr = "";

	public static void main(String args[]) {
		for (int P = 1; P <= code.length(); P++) {
			int formula = (3 * P) + K;
			key.add(formula);

		}
		for (int i = 0; i < code.length() ; i++) {
			String temp = code.substring(i, i + 1);
			result[i] = alphabet.substring((alphabet.lastIndexOf(temp)) - (key.get(i)),
					((alphabet.lastIndexOf(temp)) - (key.get(i))) + 1);
		}
		for (int j = 0; j < code.length(); j++) {

			newStr += result[j];
		}

		System.out.println(newStr);
	}

}
